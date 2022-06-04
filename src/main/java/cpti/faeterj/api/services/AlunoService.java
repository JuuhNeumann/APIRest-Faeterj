package cpti.faeterj.api.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cpti.faeterj.api.dto.AlunoDTO;
import cpti.faeterj.api.entity.Aluno;
import cpti.faeterj.api.entity.Disciplinas;
import cpti.faeterj.api.entity.service.repository.AlunoRepository;
import cpti.faeterj.api.entity.service.repository.DisciplinasRepository;
import cpti.faeterj.api.exception.ObjectNotFoundException;

@Service
public class AlunoService {

	//instancia obj
	@Autowired
	AlunoRepository repo;
	@Autowired
	DisciplinasRepository repodisciplina;
	
	@Transactional
	public Aluno InserirObj(Aluno obj) {
		obj = repo.save(obj);
		repodisciplina.saveAll(obj.getDisciplinas());
		return obj;
	}
	
	public List<Aluno> findAllObj() {
		
		return repo.findAll();
		
	}
	
	public void DeleteObj(long id) {
		
		repo.deleteById(id);
	}

	public Aluno FindByIdObj(Long id) {
		
		Optional<Aluno> obj  = repo.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id));
	}
	
	
	public void UpdateObj(Aluno newObj) {
		
		Aluno obj = FindByIdObj(newObj.getId());
		obj = newObj;
		repo.save(obj);		
	}

	public Aluno FromDTO(AlunoDTO alunodto) {
		Disciplinas obj = repodisciplina.findByDisciplinas(alunodto.getDisciplina());
		Aluno aluno = new Aluno(alunodto.getNome(), alunodto.getEmail());
		Disciplinas ojb2 = new Disciplinas(obj.getDisciplinas(), obj.getProfessor(), obj.getPeso(), aluno, obj.getPeriodo(), obj.getPeso());
		aluno.getDisciplinas().add(ojb2);
		
		return aluno;
	}
}
