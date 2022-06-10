package br.edu.faeterj.api.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Post {

	@Id // define a chave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto incrementavel
	private Long id;
	private String imgPost;
	private String conteudo;

	public Post() {
	}

	public Post(String imgPost, String conteudo) {
		this.imgPost = imgPost;
		this.conteudo = conteudo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getImgPost() {
		return imgPost;
	}

	public void setImgPost(String imgPost) {
		this.imgPost = imgPost;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
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
		Post other = (Post) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", imgPost=" + imgPost + ", conteudo=" + conteudo + "]";
	}

}
