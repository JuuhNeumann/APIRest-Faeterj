package cpti.faeterj.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cpti.faeterj.api.entity.Noticias;
import cpti.faeterj.api.entity.service.repository.NoticiasRepository;

@Service
public class NoticiasService {

	//instancia obj
	@Autowired
	NoticiasRepository repo;
	
	public Noticias InserirObj(Noticias obj) {
		obj = repo.save(obj);
		return obj;
	}
	
	public List<Noticias> findAllObj() {
		
		return repo.findAll();
		
	}
	
	public void DeleteObj(long id) {
		
		repo.deleteById(id);
	}
	
}
