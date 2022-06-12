package br.edu.faeterj.api.dto;

import java.util.ArrayList;
import java.util.List;
<<<<<<< HEAD:src/main/java/cpti/faeterj/api/dto/PeriodoDTO.java
import java.util.Objects;
=======
>>>>>>> bce3d6d4b3aef6446399991552d9ade631c84275:src/main/java/br/edu/faeterj/api/dto/PeriodoDTO.java

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

<<<<<<< HEAD:src/main/java/cpti/faeterj/api/dto/PeriodoDTO.java
	@Override
	public int hashCode() {
		return Objects.hash(disciplinas, periodo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PeriodoDTO other = (PeriodoDTO) obj;
		return Objects.equals(disciplinas, other.disciplinas) && Objects.equals(periodo, other.periodo);
	}

	@Override
	public String toString() {
		return "PeriodoDTO [periodo=" + periodo + ", disciplinas=" + disciplinas + "]";
	}
}
=======
}
>>>>>>> bce3d6d4b3aef6446399991552d9ade631c84275:src/main/java/br/edu/faeterj/api/dto/PeriodoDTO.java
