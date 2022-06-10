package br.edu.faeterj.api.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

public class NewAlunoDTO {

	// CLIENTE
	@NotEmpty(message = "Preenchimento obrigatorio")
	@Length(min = 5, max = 80, message = "O Tamanho do nome deve ser entre 5 e 80 caracteres")
	private String nome;

	@NotEmpty(message = "Preenchimento obrigatorio")
	@Email(message = "Email invalido")
	@Column(unique = true)
	private String email;

	@NotEmpty(message = "Preenchimento obrigatorio")
	private String senha;

	private List<DisciplinasDTO> disciplinas = new ArrayList<DisciplinasDTO>();

	// ENDERECO
	@NotEmpty(message = "Preenchimento obrigatorio")
	private String rua;
	@NotEmpty(message = "Preenchimento obrigatorio")
	private String complemento;
	@NotEmpty(message = "Preenchimento obrigatorio")
	private String bairro;

	@NotEmpty(message = "Preenchimento obrigatorio")
	private String cep;

	private Integer numero;
	@NotEmpty(message = "Preenchimento obrigatorio")
	private String cidade;
	@NotEmpty(message = "Preenchimento obrigatorio")
	private String telefone1;
	private String telefone2;

	public NewAlunoDTO() {

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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getTelefone1() {
		return telefone1;
	}

	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}

	public String getTelefone2() {
		return telefone2;
	}

	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public List<DisciplinasDTO> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<DisciplinasDTO> disciplinas) {
		this.disciplinas = disciplinas;
	}

}
