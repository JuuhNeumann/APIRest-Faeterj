package cpti.faeterj.api.dto;

import java.util.Objects;

public class AlunoDTO {

	private String nome;
	private String email;
	private String disciplina;
	
	public AlunoDTO() {
	}
	
	public AlunoDTO(String nome, String email, String disciplina) {
		this.nome = nome;
		this.email = email;
		this.disciplina = disciplina;
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

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	@Override
	public int hashCode() {
		return Objects.hash(disciplina, email, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AlunoDTO other = (AlunoDTO) obj;
		return Objects.equals(disciplina, other.disciplina) && Objects.equals(email, other.email)
				&& Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "AlunoDTO [nome=" + nome + ", email=" + email + ", disciplina=" + disciplina + "]";
	}
}
