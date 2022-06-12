package cpti.faeterj.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cpti.faeterj.api.entity.Post;
import cpti.faeterj.api.entity.service.repository.PostRepository;
import cpti.faeterj.api.exception.ObjectNotFoundException;

@Service
public class PostService {

	//instancia obj
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
		Optional<Post> obj  = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id));
	}
	
	public void UpdateObj(Post newObj) {
		Post obj = FindByIdObj(newObj.getId());
		obj = newObj;
		repo.save(obj);		
	}
}
