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
<<<<<<< HEAD:src/main/java/cpti/faeterj/api/services/DisciplinasService.java
		return repo.findAll();
=======

		return repo.findAll();

>>>>>>> bce3d6d4b3aef6446399991552d9ade631c84275:src/main/java/br/edu/faeterj/api/services/DisciplinasService.java
	}

	public void DeleteObj(long id) {
<<<<<<< HEAD:src/main/java/cpti/faeterj/api/services/DisciplinasService.java
=======

>>>>>>> bce3d6d4b3aef6446399991552d9ade631c84275:src/main/java/br/edu/faeterj/api/services/DisciplinasService.java
		repo.deleteById(id);
	}

	public Disciplinas FindByIdObj(Long id) {
<<<<<<< HEAD:src/main/java/cpti/faeterj/api/services/DisciplinasService.java
		Optional<Disciplinas> obj  = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id));
=======

		Optional<Disciplinas> obj = repo.findById(id);

		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id));
>>>>>>> bce3d6d4b3aef6446399991552d9ade631c84275:src/main/java/br/edu/faeterj/api/services/DisciplinasService.java
	}

	public void UpdateObj(Disciplinas newObj) {
<<<<<<< HEAD:src/main/java/cpti/faeterj/api/services/DisciplinasService.java
=======

>>>>>>> bce3d6d4b3aef6446399991552d9ade631c84275:src/main/java/br/edu/faeterj/api/services/DisciplinasService.java
		Disciplinas obj = FindByIdObj(newObj.getId());
		obj = newObj;
		repo.save(obj);
	}

	public Disciplinas findByDisciplinas(String disciplina) {
		return repo.findByDisciplinas(disciplina);
	}
}
