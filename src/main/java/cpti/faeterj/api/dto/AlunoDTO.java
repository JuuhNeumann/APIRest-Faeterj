package cpti.faeterj.api.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AlunoDTO {

	private String nome;
	private String email;
	private List<DisciplinasDTO> disciplinas = new ArrayList<DisciplinasDTO>();
	
	public AlunoDTO() {
	}

	public List<DisciplinasDTO> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<DisciplinasDTO> disciplinas) {
		this.disciplinas = disciplinas;
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

	@Override
	public int hashCode() {
		return Objects.hash(disciplinas, email, nome);
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
		return Objects.equals(disciplinas, other.disciplinas) && Objects.equals(email, other.email)
				&& Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "AlunoDTO [nome=" + nome + ", email=" + email + ", disciplinas=" + disciplinas + "]";
	}
}