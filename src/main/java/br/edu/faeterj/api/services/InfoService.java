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

		return repo.findAll();

	}

	public void DeleteObj(long id) {

		repo.deleteById(id);
	}

	public Info FindByIdObj(Long id) {

		Optional<Info> obj = repo.findById(id);

		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id));
	}

	public void UpdateObj(Info newObj) {

		Info obj = FindByIdObj(newObj.getId());
		obj = newObj;
		repo.save(obj);
	}

}
