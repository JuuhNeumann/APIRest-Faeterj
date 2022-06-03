package cpti.faeterj.api.entity;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Periodo {

	@Id //define a chave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //auto incrementavel
	private Long id;
	@OneToMany(mappedBy = "periodo", cascade = CascadeType.ALL)
	private List<Disciplinas> disciplinas;
	private String turno;
	
	public Periodo() {
	}
	
	public Periodo(List<Disciplinas> disciplinas, String turno) {
		this.disciplinas = disciplinas;
		this.turno = turno;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Disciplinas> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplinas> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
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
		Periodo other = (Periodo) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Periodo [id=" + id + ", disciplinas=" + disciplinas + ", turno=" + turno + "]";
	}
}
