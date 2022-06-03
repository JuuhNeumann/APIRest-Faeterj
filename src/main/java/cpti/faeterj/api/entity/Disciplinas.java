package cpti.faeterj.api.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Disciplinas {
	
	@Id //define a chave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //auto incrementavel
	private Long id;
	private String disciplinas;
	private String professor;
	private String peso;
	
	public Disciplinas() {
	}
	
	public Disciplinas(String materias, String professor, String peso) {
		this.disciplinas = materias;
		this.professor = professor;
		this.peso = peso;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMaterias() {
		return disciplinas;
	}

	public void setMaterias(String materias) {
		this.disciplinas = materias;
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
		return "Disciplinas [id=" + id + ", materias=" + disciplinas + ", professor=" + professor + ", peso=" + peso + "]";
	}

}
	

