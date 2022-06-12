package cpti.faeterj.api.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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