package br.edu.faeterj.api.dto;

import java.util.Objects;

public class DisciplinasDTO {

	private String nome;
<<<<<<< HEAD:src/main/java/cpti/faeterj/api/dto/DisciplinasDTO.java
	
=======

>>>>>>> bce3d6d4b3aef6446399991552d9ade631c84275:src/main/java/br/edu/faeterj/api/dto/DisciplinasDTO.java
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
