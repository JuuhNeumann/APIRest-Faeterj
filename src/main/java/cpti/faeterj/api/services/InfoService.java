package cpti.faeterj.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cpti.faeterj.api.entity.Info;
import cpti.faeterj.api.entity.service.repository.InfoRepository;
import cpti.faeterj.api.exception.ObjectNotFoundException;

@Service
public class InfoService {

	//instancia obj
	@Autowired
	InfoRepository repo;
	
	public Info InserirObj(Info obj) {
		obj = repo.save(obj);
		return obj;
	}
	
	public List<Info> findAllObj() {
		return repo.findAll();
	}
	
	public void DeleteObj(long id) {
		repo.deleteById(id);
	}

	public Info FindByIdObj(Long id) {
		Optional<Info> obj  = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id));
	}
	
	public void UpdateObj(Info newObj) {
		Info obj = FindByIdObj(newObj.getId());
		obj = newObj;
		repo.save(obj);		
	}
}
