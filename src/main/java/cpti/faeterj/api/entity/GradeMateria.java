package cpti.faeterj.api.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GradeMateria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //auto incrementavel
	private Long id;
	private String imgGrade;
	private String imgCalendario;
	
	public GradeMateria() {
	}
	
	public GradeMateria(String imgGrade, String imgCalendario) {
		this.imgGrade = imgGrade;
		this.setImgCalendario(imgCalendario);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getImgGrade() {
		return imgGrade;
	}

	public void setImgGrade(String img) {
		this.imgGrade = imgGrade;
	}
	public String getImgCalendario() {
		return imgCalendario;
	}

	public void setImgCalendario(String imgCalendario) {
		this.imgCalendario = imgCalendario;
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
		GradeMateria other = (GradeMateria) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "GradeMateria [id=" + id + ", imgGrade=" + imgGrade + ", imgCalendario=" + imgCalendario + "]";
	}

}
