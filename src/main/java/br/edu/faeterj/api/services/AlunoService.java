package br.edu.faeterj.api.services;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import br.edu.faeterj.api.dto.AlunoDTO;
import br.edu.faeterj.api.dto.DisciplinasDTO;
import br.edu.faeterj.api.dto.NewAlunoDTO;
import br.edu.faeterj.api.entity.Aluno;
import br.edu.faeterj.api.entity.Disciplinas;
import br.edu.faeterj.api.entity.Endereco;
import br.edu.faeterj.api.repositories.AlunoRepository;
import br.edu.faeterj.api.repositories.DisciplinasRepository;
import br.edu.faeterj.api.repositories.EnderecoRepository;
import br.edu.faeterj.api.security.UserSS;
import br.edu.faeterj.api.services.exceptions.AuthorizationException;
import br.edu.faeterj.api.services.exceptions.DataIntegrityException;
import br.edu.faeterj.api.services.exceptions.ObjectNotFoundException;

@Service
public class AlunoService {
	@Autowired
	private BCryptPasswordEncoder pe;
	@Autowired
	private AlunoRepository repo;

	@Autowired
	private EnderecoRepository enderecoRepository;

	@Autowired
	private DisciplinasRepository repoDisciplinas;

	@Autowired
	private S3Service s3Service;

	public Aluno listar(Long id) {
		Optional<Aluno> obj = repo.findById(id);
		// lançando exception
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Aluno.class.getName()));

	}

	public List<Aluno> findAll() {
		return repo.findAll();
	}

	public Aluno buscar(Long id) {
		Optional<Aluno> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Aluno.class.getName()));
	}

	@Transactional
	public Aluno insert(Aluno obj) {
		obj.setId(null);
		obj = repo.save(obj);
		enderecoRepository.saveAll(obj.getEnderecos());
		repoDisciplinas.saveAll(obj.getDisciplinas());
		return obj;
	}

	public void delete(Long id) {
		buscar(id);
		try {
			repo.deleteById(id);
		} catch (DataIntegrityViolationException e) {
			throw new DataIntegrityException("Não é possivel excluir porque há pedidos relacionados ");

		}

	}

	public Aluno update(Aluno obj) {
		Aluno novoObj = buscar(obj.getId());

		// atualiza somente os campos nome e-email
		upddateData(novoObj, obj);

		return repo.save(novoObj);
	}

	private void upddateData(Aluno novoObj, Aluno obj) {
		novoObj.setNome(obj.getNome());
		novoObj.setEmail(obj.getEmail());

	}

	public List<AlunoDTO> clientes() {

		List<Aluno> lista = new ArrayList<>();
		lista = repo.findAll();

		List<AlunoDTO> listaDTO = new ArrayList<>();

		for (Aluno x : lista) {

			listaDTO.add(new AlunoDTO(x));
		}

		return listaDTO;

	}

	public Aluno fromDTO(NewAlunoDTO objDto) {

		Aluno aluno = new Aluno(objDto.getNome(), objDto.getEmail(), objDto.getSenha());

		Endereco endereco = new Endereco(null, objDto.getRua(), objDto.getComplemento(), objDto.getBairro(),
				objDto.getCep(), objDto.getNumero(), aluno, objDto.getCidade());

		aluno.getEnderecos().add(endereco);
		aluno.getTelefones().add(objDto.getTelefone1());

		// Percorrendo nosso Array de disciplinas
		for (DisciplinasDTO x : objDto.getDisciplinas()) {
			Disciplinas obj = repoDisciplinas.findByDisciplinas(x.getNome());
			obj.getAlunin().add(aluno);
			aluno.getDisciplinas().add(obj);
		}

		return aluno;
	}

	public Long count() {
		return repo.count();
	}

	public URI fotoProduto(MultipartFile multi) {

		UserSS user = UserService.authenticated();
		if (user == null)
			throw new AuthorizationException("Acesso negado!");

		URI uri = s3Service.uploadFile(multi);
		Aluno cli = buscar(user.getId());
		cli.setUrlFotoPerfil(uri.toString());

		repo.save(cli);

		return uri;

	}

}
