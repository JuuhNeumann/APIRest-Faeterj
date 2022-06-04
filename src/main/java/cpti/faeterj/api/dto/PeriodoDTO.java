package cpti.faeterj.api.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PeriodoDTO {

	private String turno;
	private String periodo;
	private List<DisciplinasDTO> disciplinas = new ArrayList<>();
	
	public PeriodoDTO() {
	}
	
	
	public PeriodoDTO(String turno, List<DisciplinasDTO> disciplinas) {
		this.turno = turno;
		this.disciplinas = disciplinas;
	}

	public String getTurno() {
		return turno;
	}


	public void setTurno(String turno) {
		this.turno = turno;
	}


	public List<DisciplinasDTO> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<DisciplinasDTO> disciplinas) {
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
		return Objects.hash(disciplinas, turno);
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
		return Objects.equals(disciplinas, other.disciplinas) && Objects.equals(turno, other.turno);
	}

	@Override
	public String toString() {
		return "PeriodoDTO [turno=" + turno + ", periodo=" + periodo + ", disciplinas=" + disciplinas + "]";
	}
}

	
