package cpti.faeterj.api.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cpti.faeterj.api.dto.DisciplinasDTO;
import cpti.faeterj.api.dto.GradeDto;
import cpti.faeterj.api.dto.PeriodoDTO;
import cpti.faeterj.api.entity.Disciplinas;
import cpti.faeterj.api.entity.Periodo;
import cpti.faeterj.api.entity.service.repository.DisciplinasRepository;
import cpti.faeterj.api.entity.service.repository.PeriodoRepository;
import cpti.faeterj.api.exception.ObjectNotFoundException;

@Service
public class PeriodoService {

	// instancia obj
	@Autowired
	PeriodoRepository repo;
	@Autowired
	DisciplinasRepository repodisciplina;

	public List<PeriodoDTO> findAllObj() {

		List<PeriodoDTO> listPeriodo = new ArrayList<PeriodoDTO>();
		List<Disciplinas> list = repodisciplina.findAll();

		PeriodoDTO periodo1 = new PeriodoDTO();
		PeriodoDTO periodo2 = new PeriodoDTO();
		PeriodoDTO periodo3 = new PeriodoDTO();
		PeriodoDTO periodo4 = new PeriodoDTO();
		PeriodoDTO periodo5 = new PeriodoDTO();

		GradeDto gradeDTO = new GradeDto(null, null, null, null);
		
		for (Disciplinas disciplina : list) {

			switch (disciplina.getPeriodo()) {
			case "primeiro":
				periodo1.setPeriodo("primeiro");
				gradeDTO.montarObj(disciplina);
				periodo1.getDisciplinas().add(new GradeDto(disciplina.getId(), disciplina.getDisciplinas(), disciplina.getProfessor(), disciplina.getPeso()));
				break;
			case "segundo":
				periodo2.setPeriodo("segundo");
				gradeDTO.montarObj(disciplina);
				periodo2.getDisciplinas().add(new GradeDto(disciplina.getId(), disciplina.getDisciplinas(), disciplina.getProfessor(), disciplina.getPeso()));
				break;
			case "terceiro":
				periodo3.setPeriodo("terceiro");
				gradeDTO.montarObj(disciplina);
				periodo3.getDisciplinas().add(new GradeDto(disciplina.getId(), disciplina.getDisciplinas(), disciplina.getProfessor(), disciplina.getPeso()));

				break;
			case "quarto":
				periodo4.setPeriodo("quarto");
				gradeDTO.montarObj(disciplina);
				periodo4.getDisciplinas().add(new GradeDto(disciplina.getId(), disciplina.getDisciplinas(), disciplina.getProfessor(), disciplina.getPeso()));
				break;
			case "quinto":
				periodo5.setPeriodo("quinto");
				gradeDTO.montarObj(disciplina);
				periodo5.getDisciplinas().add(new GradeDto(disciplina.getId(), disciplina.getDisciplinas(), disciplina.getProfessor(), disciplina.getPeso()));
				break;

			default:
				break;
			}

		}

		if (!periodo1.getDisciplinas().isEmpty()) {

			listPeriodo.add(periodo1);
		}

		if (!periodo2.getDisciplinas().isEmpty()) {

			listPeriodo.add(periodo2);
		}
		if (!periodo3.getDisciplinas().isEmpty()) {

			listPeriodo.add(periodo3);
		}
		if (!periodo4.getDisciplinas().isEmpty()) {
			listPeriodo.add(periodo4);
		}
		if (!periodo5.getDisciplinas().isEmpty()) {

			listPeriodo.add(periodo5);
		}
		return listPeriodo;

	}

}
