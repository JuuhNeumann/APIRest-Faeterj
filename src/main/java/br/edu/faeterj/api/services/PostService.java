package br.edu.faeterj.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.faeterj.api.entity.Post;
import br.edu.faeterj.api.repositories.PostRepository;
import br.edu.faeterj.api.services.exceptions.ObjectNotFoundException;

@Service
public class PostService {

	// instancia obj
	@Autowired
	PostRepository repo;

	public Post InserirObj(Post obj) {
		obj = repo.save(obj);
		return obj;
	}
<<<<<<< HEAD:src/main/java/cpti/faeterj/api/services/PostService.java
	
	public List<Post> findAllObj() {	
		return repo.findAll();	
=======

	public List<Post> findAllObj() {

		return repo.findAll();

>>>>>>> bce3d6d4b3aef6446399991552d9ade631c84275:src/main/java/br/edu/faeterj/api/services/PostService.java
	}

	public void DeleteObj(long id) {
<<<<<<< HEAD:src/main/java/cpti/faeterj/api/services/PostService.java
=======

>>>>>>> bce3d6d4b3aef6446399991552d9ade631c84275:src/main/java/br/edu/faeterj/api/services/PostService.java
		repo.deleteById(id);
	}

	public Post FindByIdObj(Long id) {
<<<<<<< HEAD:src/main/java/cpti/faeterj/api/services/PostService.java
		Optional<Post> obj  = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id));
	}
	
	public void UpdateObj(Post newObj) {
=======

		Optional<Post> obj = repo.findById(id);

		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id));
	}

	public void UpdateObj(Post newObj) {

>>>>>>> bce3d6d4b3aef6446399991552d9ade631c84275:src/main/java/br/edu/faeterj/api/services/PostService.java
		Post obj = FindByIdObj(newObj.getId());
		obj = newObj;
		repo.save(obj);
	}
}
