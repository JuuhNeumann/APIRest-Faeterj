package br.edu.faeterj.api.entity;

import java.net.URI;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GradeMateria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto incrementavel
	private Long id;

	private URI img; 

	public GradeMateria() {
	}

	
	
	public GradeMateria(URI img) {
		this.img = img;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public URI getImg() {
		return img;
	}

	public void setImg(URI img) {
		this.img = img;
	}

	
	
	

}
