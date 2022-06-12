package cpti.faeterj.api.dto;

import java.util.Objects;

public class DisciplinasDTO {
	
	private String nome;
	
	public DisciplinasDTO() {
	}

	public DisciplinasDTO(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DisciplinasDTO other = (DisciplinasDTO) obj;
		return Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "DisciplinasDTO [nome=" + nome + "]";
	}
}


