package br.edu.faeterj.api.dto;

import java.util.ArrayList;
import java.util.List;

public class ListDisciplinasDTO {

	private List<DisciplinasDTO> disciplinas = new ArrayList<>();

	public ListDisciplinasDTO() {
	}

	public List<DisciplinasDTO> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<DisciplinasDTO> disciplinas) {
		this.disciplinas = disciplinas;
	}


}
