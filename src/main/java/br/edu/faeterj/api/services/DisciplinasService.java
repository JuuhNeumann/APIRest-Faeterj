package br.edu.faeterj.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.faeterj.api.entity.Disciplinas;
import br.edu.faeterj.api.repositories.DisciplinasRepository;
import br.edu.faeterj.api.services.exceptions.ObjectNotFoundException;

@Service
public class DisciplinasService {

	// instancia obj
	@Autowired
	DisciplinasRepository repo;

	public Disciplinas InserirObj(Disciplinas obj) {
		obj = repo.save(obj);
		return obj;
	}

	public List<Disciplinas> findAllObj() {

		return repo.findAll();

	}

	public void DeleteObj(long id) {

		repo.deleteById(id);
	}

	public Disciplinas FindByIdObj(Long id) {

		Optional<Disciplinas> obj = repo.findById(id);

		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id));
	}

	public void UpdateObj(Disciplinas newObj) {

		Disciplinas obj = FindByIdObj(newObj.getId());
		obj = newObj;
		repo.save(obj);
	}

	public Disciplinas findByDisciplinas(String disciplina) {
		return repo.findByDisciplinas(disciplina);
	}

}
