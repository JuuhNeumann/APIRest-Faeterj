package cpti.faeterj.api.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Disciplinas {
	
	@Id //define a chave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //auto incrementavel
	private Long id;
	private String disciplinas;
	private String professor;
	private String peso;
	@ManyToOne
	@JoinColumn(name = "id_aluno")
	private Aluno aluno;
	@ManyToOne
	@JoinColumn(name = "id_periodo")
	private Periodo periodo;
	
	public Disciplinas() {
	}
	
	public Disciplinas(String disciplinas, String professor, String peso, Aluno aluno, Periodo periodo) {
		this.disciplinas = disciplinas;
		this.professor = professor;
		this.peso = peso;
		this.aluno = aluno;
		this.periodo = periodo;
	}
	

	public Periodo getPeriodo() {
		return periodo;
	}

	public void setPeriodo(Periodo periodo) {
		this.periodo = periodo;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(String disciplinas) {
		this.disciplinas = disciplinas;
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
		Disciplinas other = (Disciplinas) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Disciplinas [id=" + id + ", disciplinas=" + disciplinas + ", professor=" + professor + ", peso=" + peso
				+ ", aluno=" + aluno + ", periodo=" + periodo + "]";
	}
}
	

