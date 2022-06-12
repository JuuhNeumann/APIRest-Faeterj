package br.edu.faeterj.api.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Periodo {

	@Id // define a chave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto incrementavel
	private Long id;
	private String turno;
	private String periodo;

	public Periodo() {
	}

	public Periodo(String turno, String periodo) {
		this.turno = turno;
		this.periodo = periodo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
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
		Periodo other = (Periodo) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Periodo [id=" + id + ", turno=" + turno + ", periodo=" + periodo + "]";
	}
}
