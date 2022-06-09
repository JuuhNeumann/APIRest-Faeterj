package cpti.faeterj.api.dto;

import cpti.faeterj.api.entity.Disciplinas;

public class GradeDto {
	private Long id;
	private String disciplina;
	private String professor;
	private String peso;
	
	public void montarObj (Disciplinas x) {
		this.id = x.getId();
		this.disciplina = x.getDisciplinas();
		this.professor = x.getProfessor();
		this.peso = x.getPeso();
	}
	
	
	
	
	public GradeDto(Long id, String disciplina, String professor, String peso) {
		super();
		this.id = id;
		this.disciplina = disciplina;
		this.professor = professor;
		this.peso = peso;
	}




	public Long getId() {
		return id;
	}
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
	public void setPeso(String peso) {
		this.peso = peso;
	}

	
	
	
	
	
	
}
