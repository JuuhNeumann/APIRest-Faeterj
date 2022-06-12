package br.edu.faeterj.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.faeterj.api.entity.Info;
import br.edu.faeterj.api.repositories.InfoRepository;
import br.edu.faeterj.api.services.exceptions.ObjectNotFoundException;

@Service
public class InfoService {

	// instancia obj
	@Autowired
	InfoRepository repo;

	public Info InserirObj(Info obj) {
		obj = repo.save(obj);
		return obj;
	}

	public List<Info> findAllObj() {
<<<<<<< HEAD:src/main/java/cpti/faeterj/api/services/InfoService.java
		return repo.findAll();
=======

		return repo.findAll();

>>>>>>> bce3d6d4b3aef6446399991552d9ade631c84275:src/main/java/br/edu/faeterj/api/services/InfoService.java
	}

	public void DeleteObj(long id) {
<<<<<<< HEAD:src/main/java/cpti/faeterj/api/services/InfoService.java
=======

>>>>>>> bce3d6d4b3aef6446399991552d9ade631c84275:src/main/java/br/edu/faeterj/api/services/InfoService.java
		repo.deleteById(id);
	}

	public Info FindByIdObj(Long id) {
<<<<<<< HEAD:src/main/java/cpti/faeterj/api/services/InfoService.java
		Optional<Info> obj  = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id));
	}
	
	public void UpdateObj(Info newObj) {
=======

		Optional<Info> obj = repo.findById(id);

		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id));
	}

	public void UpdateObj(Info newObj) {

>>>>>>> bce3d6d4b3aef6446399991552d9ade631c84275:src/main/java/br/edu/faeterj/api/services/InfoService.java
		Info obj = FindByIdObj(newObj.getId());
		obj = newObj;
		repo.save(obj);
	}
}
