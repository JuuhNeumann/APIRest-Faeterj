package cpti.faeterj.api.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Disciplinas {
	
	@Id //define a chave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //auto incrementavel
	private Long id;
	private String disciplinas;
	private String professor;
	private String peso;

	
	@JsonIgnore
	@ManyToMany(cascade=CascadeType.PERSIST)
	@JoinTable(
	  name = "course_like", 
	  joinColumns = @JoinColumn(name = "student_id"), 
	  inverseJoinColumns = @JoinColumn(name = "course_id"))
	private List<Aluno> alunin = new ArrayList<>();
	
	
	
	@ManyToOne
	@JoinColumn(name = "id_periodo")
	@JsonIgnore
	private Periodo periodo;
	@JsonIgnore
	private String turno;
	
	public Disciplinas() {
	}
	
	public List<Aluno> getAlunin() {
		return alunin;
	}

	public void setAlunin(List<Aluno> alunin) {
		this.alunin = alunin;
	}

	public Disciplinas(String disciplinas, String professor, String peso, Periodo periodo, String turno) {
		this.disciplinas = disciplinas;
		this.professor = professor;
		this.peso = peso;
		this.periodo = periodo;
		this.turno = turno;
	}
	
	

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public Periodo getPeriodo() {
		return periodo;
	}

	public void setPeriodo(Periodo periodo) {
		this.periodo = periodo;
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


}
	

