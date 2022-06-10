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

	public List<Post> findAllObj() {

		return repo.findAll();

	}

	public void DeleteObj(long id) {

		repo.deleteById(id);
	}

	public Post FindByIdObj(Long id) {

		Optional<Post> obj = repo.findById(id);

		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id));
	}

	public void UpdateObj(Post newObj) {

		Post obj = FindByIdObj(newObj.getId());
		obj = newObj;
		repo.save(obj);
	}

}
