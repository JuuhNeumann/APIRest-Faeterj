package cpti.faeterj.api.entity;

import java.util.Objects;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Noticias {

	@Id //define a chave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //auto incrementavel
	private Long id;
	private String imgNoticias;
	private String titulo;
	private String categoria;
	private String conteudo;
	private String data;

	public Noticias() {
	}
	
	public Noticias(String imgNoticias, String titulo, String categoria, String conteudo, String data) {
		this.imgNoticias = imgNoticias;
		this.titulo = titulo;
		this.categoria = categoria;
		this.conteudo = conteudo;
		this.data = data;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getImgNoticias() {
		return imgNoticias;
	}

	public void setImgNoticias(String imgNoticias) {
		this.imgNoticias = imgNoticias;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
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
		Noticias other = (Noticias) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Noticias [id=" + id + ", imgNoticias=" + imgNoticias + ", titulo=" + titulo + ", categoria=" + categoria
				+ ", conteudo=" + conteudo + ", data=" + data + "]";
	}
}
