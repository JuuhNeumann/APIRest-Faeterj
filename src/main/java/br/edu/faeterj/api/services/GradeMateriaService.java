package br.edu.faeterj.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.faeterj.api.entity.GradeMateria;
import br.edu.faeterj.api.repositories.GradeMateriaRepository;
import br.edu.faeterj.api.services.exceptions.ObjectNotFoundException;

@Service
public class GradeMateriaService {

	// instancia obj
	@Autowired
	GradeMateriaRepository repo;

	public GradeMateria InserirObj(GradeMateria obj) {
		obj = repo.save(obj);
		return obj;
	}

	public List<GradeMateria> findAllObj() {

		return repo.findAll();

	}

	public void DeleteObj(long id) {

		repo.deleteById(id);
	}

	public GradeMateria FindByIdObj(Long id) {

		Optional<GradeMateria> obj = repo.findById(id);

		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id));
	}

	public void UpdateObj(GradeMateria newObj) {

		GradeMateria obj = FindByIdObj(newObj.getId());
		obj = newObj;
		repo.save(obj);
	}

}
