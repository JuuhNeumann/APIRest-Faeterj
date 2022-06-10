package br.edu.faeterj.api.dto;

import java.util.ArrayList;
import java.util.List;

public class PeriodoDTO {

	private String periodo;
	private List<GradeDto> disciplinas = new ArrayList<>();

	public PeriodoDTO() {
	}

	public List<GradeDto> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<GradeDto> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

}
