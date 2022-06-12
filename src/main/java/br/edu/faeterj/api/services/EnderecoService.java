package br.edu.faeterj.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.faeterj.api.entity.Endereco;
import br.edu.faeterj.api.repositories.EnderecoRepository;
import br.edu.faeterj.api.services.exceptions.ObjectNotFoundException;

@Service
public class EnderecoService {

	@Autowired
	private EnderecoRepository repo;

	public Endereco buscar(Long id) {
		Optional<Endereco> obj = repo.findById(id);

		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto Não Encontrado"));

	}

	public List<Endereco> findAll() {
		return repo.findAll();
	}

	public List<Endereco> findCidade(String cidade) {

		return repo.findByCidade(cidade);

	}

}
