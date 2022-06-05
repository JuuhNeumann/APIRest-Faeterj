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

}
