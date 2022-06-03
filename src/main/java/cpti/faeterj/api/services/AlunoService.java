package cpti.faeterj.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cpti.faeterj.api.entity.Aluno;
import cpti.faeterj.api.entity.service.repository.AlunoRepository;
import cpti.faeterj.api.exception.ObjectNotFoundException;

@Service
public class AlunoService {

	//instancia obj
	@Autowired
	AlunoRepository repo;
	
	public Aluno InserirObj(Aluno obj) {
		obj = repo.save(obj);
		return obj;
	}
	
	public List<Aluno> findAllObj() {
		
		return repo.findAll();
		
	}
	
	public void DeleteObj(long id) {
		
		repo.deleteById(id);
	}

	public Aluno FindByIdObj(Long id) {
		
		Optional<Aluno> obj  = repo.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id));
	}
	
	
	public void UpdateObj(Aluno newObj) {
		
		Aluno obj = FindByIdObj(newObj.getId());
		obj = newObj;
		repo.save(obj);		
	}

}
