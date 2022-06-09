package cpti.faeterj.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cpti.faeterj.api.dto.DisciplinasDTO;
import cpti.faeterj.api.dto.PeriodoDTO;
import cpti.faeterj.api.entity.Disciplinas;
import cpti.faeterj.api.entity.Periodo;
import cpti.faeterj.api.entity.service.repository.DisciplinasRepository;
import cpti.faeterj.api.entity.service.repository.PeriodoRepository;
import cpti.faeterj.api.exception.ObjectNotFoundException;

@Service
public class PeriodoService {

	//instancia obj
	@Autowired
	PeriodoRepository repo;
	@Autowired
	DisciplinasRepository repodisciplina;
	
	public Periodo InserirObj(Periodo obj) {
		obj = repo.save(obj);
		//repodisciplina.saveAll(obj.getDisciplinas());
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
	
	public Periodo FromDTO(PeriodoDTO objDTO) {
		Periodo periodo = new Periodo();
		periodo.setTurno(objDTO.getTurno());
		periodo.setPeriodo(objDTO.getPeriodo());
		
		for (DisciplinasDTO x : objDTO.getDisciplinas()) {
			Disciplinas disci = repodisciplina.findByDisciplinas(x.getNome());
			Disciplinas disciplina = new Disciplinas(disci.getDisciplinas(), disci.getProfessor(), disci.getPeso(), disci.getAluno(), periodo, disci.getTurno());
			periodo.getDisciplinas().add(disciplina);
		}
		
		return periodo;
	}
	
	public Periodo AddFromDTO(PeriodoDTO objDTO) { //recebe periodo que já existe
		Periodo periodo = repo.findByPeriodo(objDTO.getPeriodo());
		periodo.setTurno(objDTO.getTurno());
		periodo.setPeriodo(objDTO.getPeriodo());
		
		for (DisciplinasDTO x : objDTO.getDisciplinas()) {
			Disciplinas disci = repodisciplina.findByDisciplinas(x.getNome());
			Disciplinas disciplina = new Disciplinas(disci.getDisciplinas(), disci.getProfessor(), disci.getPeso(), disci.getAluno(), periodo, disci.getTurno());
			periodo.getDisciplinas().add(disciplina);
		}
		
		return periodo;
	}
}
