package br.edu.faeterj.api.dto;

<<<<<<< HEAD:src/main/java/cpti/faeterj/api/dto/GradeDto.java
import java.util.Objects;

import cpti.faeterj.api.entity.Disciplinas;
=======
import br.edu.faeterj.api.entity.Disciplinas;
>>>>>>> bce3d6d4b3aef6446399991552d9ade631c84275:src/main/java/br/edu/faeterj/api/dto/GradeDto.java

public class GradeDto {
	private Long id;
	private String disciplina;
	private String professor;
	private String peso;

	public void montarObj(Disciplinas x) {
		this.id = x.getId();
		this.disciplina = x.getDisciplinas();
		this.professor = x.getProfessor();
		this.peso = x.getPeso();
	}
<<<<<<< HEAD:src/main/java/cpti/faeterj/api/dto/GradeDto.java
	
=======

>>>>>>> bce3d6d4b3aef6446399991552d9ade631c84275:src/main/java/br/edu/faeterj/api/dto/GradeDto.java
	public GradeDto(Long id, String disciplina, String professor, String peso) {
		this.id = id;
		this.disciplina = disciplina;
		this.professor = professor;
		this.peso = peso;
	}

	public Long getId() {
		return id;
	}
<<<<<<< HEAD:src/main/java/cpti/faeterj/api/dto/GradeDto.java
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getDisciplina() {
		return disciplina;
	}
	
	public void setDisciplina(String disciplinas) {
		this.disciplina = disciplinas;
	}
	
	public String getProfessor() {
		return professor;
	}
	
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	
	public String getPeso() {
		return peso;
	}
	
=======

	public void setId(Long id) {
		this.id = id;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplinas) {
		this.disciplina = disciplinas;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public String getPeso() {
		return peso;
	}

>>>>>>> bce3d6d4b3aef6446399991552d9ade631c84275:src/main/java/br/edu/faeterj/api/dto/GradeDto.java
	public void setPeso(String peso) {
		this.peso = peso;
	}

<<<<<<< HEAD:src/main/java/cpti/faeterj/api/dto/GradeDto.java
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GradeDto other = (GradeDto) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "GradeDto [id=" + id + ", disciplina=" + disciplina + ", professor=" + professor + ", peso=" + peso
				+ "]";
	}
}
=======
}
>>>>>>> bce3d6d4b3aef6446399991552d9ade631c84275:src/main/java/br/edu/faeterj/api/dto/GradeDto.java
