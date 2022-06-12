package br.edu.faeterj.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.faeterj.api.entity.Noticias;
import br.edu.faeterj.api.repositories.NoticiasRepository;
import br.edu.faeterj.api.services.exceptions.ObjectNotFoundException;

@Service
public class NoticiasService {

	// instancia obj
	@Autowired
	NoticiasRepository repo;

	public Noticias InserirObj(Noticias obj) {
		obj = repo.save(obj);
		return obj;
	}

	public List<Noticias> findAllObj() {
<<<<<<< HEAD:src/main/java/cpti/faeterj/api/services/NoticiasService.java
		return repo.findAll();
=======

		return repo.findAll();

>>>>>>> bce3d6d4b3aef6446399991552d9ade631c84275:src/main/java/br/edu/faeterj/api/services/NoticiasService.java
	}

	public void DeleteObj(long id) {
<<<<<<< HEAD:src/main/java/cpti/faeterj/api/services/NoticiasService.java
=======

>>>>>>> bce3d6d4b3aef6446399991552d9ade631c84275:src/main/java/br/edu/faeterj/api/services/NoticiasService.java
		repo.deleteById(id);
	}

	public Noticias FindByIdObj(Long id) {
<<<<<<< HEAD:src/main/java/cpti/faeterj/api/services/NoticiasService.java
		Optional<Noticias> obj  = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id));
=======

		Optional<Noticias> obj = repo.findById(id);

		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id));
>>>>>>> bce3d6d4b3aef6446399991552d9ade631c84275:src/main/java/br/edu/faeterj/api/services/NoticiasService.java
	}

	public void UpdateObj(Noticias newObj) {
<<<<<<< HEAD:src/main/java/cpti/faeterj/api/services/NoticiasService.java
		Noticias obj = FindByIdObj(newObj.getId());
		obj = newObj;
		repo.save(obj);
	}
=======

		Noticias obj = FindByIdObj(newObj.getId());
		obj = newObj;
		repo.save(obj);

	}

>>>>>>> bce3d6d4b3aef6446399991552d9ade631c84275:src/main/java/br/edu/faeterj/api/services/NoticiasService.java
}
