package cpti.faeterj.api.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Aluno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //auto incrementavel
	private Long id;
	private String nome;
	private String email;
	@OneToMany(mappedBy = "aluno", cascade = CascadeType.ALL)
	private List<Disciplinas> disciplinas = new ArrayList<>();
	
	public Aluno() {
	}
	
	public Aluno(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}
	
	public Aluno(String nome, String email, List<Disciplinas> disciplinas) {
		super();
		this.nome = nome;
		this.email = email;
		this.disciplinas = disciplinas;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Disciplinas> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplinas> disciplinas) {
		this.disciplinas = disciplinas;
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
		Aluno other = (Aluno) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Aluno [id=" + id + ", nome=" + nome + ", email=" + email + ", disciplinas=" + disciplinas + "]";
	}
	
}
