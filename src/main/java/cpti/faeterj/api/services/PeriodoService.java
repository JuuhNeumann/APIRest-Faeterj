package cpti.faeterj.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cpti.faeterj.api.entity.Periodo;
import cpti.faeterj.api.entity.service.repository.PeriodoRepository;
import cpti.faeterj.api.exception.ObjectNotFoundException;

@Service
public class PeriodoService {

	//instancia obj
	@Autowired
	PeriodoRepository repo;
	
	public Periodo InserirObj(Periodo obj) {
		obj = repo.save(obj);
		return obj;
	}
	
	public List<Periodo> findAllObj() {
		
		return repo.findAll();
		
	}
	
	public void DeleteObj(long id) {
		
		repo.deleteById(id);
	}

	public Periodo FindByIdObj(Long id) {
		
		Optional<Periodo> obj  = repo.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id));
	}
	
	
	public void UpdateObj(Periodo newObj) {
		
		Periodo obj = FindByIdObj(newObj.getId());
		obj = newObj;
		repo.save(obj);		
	}

}
