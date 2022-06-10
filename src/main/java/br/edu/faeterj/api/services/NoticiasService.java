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

		return repo.findAll();

	}

	public void DeleteObj(long id) {

		repo.deleteById(id);
	}

	public Noticias FindByIdObj(Long id) {

		Optional<Noticias> obj = repo.findById(id);

		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id));
	}

	public void UpdateObj(Noticias newObj) {

		Noticias obj = FindByIdObj(newObj.getId());
		obj = newObj;
		repo.save(obj);

	}

}
