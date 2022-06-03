package cpti.faeterj.api.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Info {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //auto incrementavel
	private Long id;
	private String tel;
	private String imgLogo;
	private String insta;
	private String face;
	private String endereco;
	private String email;
	
	public Info() {
	}
	
	public Info(String tel, String imgLogo, String insta, String face, String endereco, String email) {
		this.tel = tel;
		this.imgLogo = imgLogo;
		this.insta = insta;
		this.face = face;
		this.endereco = endereco;
		this.email = email;
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
		Info other = (Info) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Info [id=" + id + ", tel=" + tel + ", imgLogo=" + imgLogo + ", insta=" + insta + ", face=" + face
				+ ", endereco=" + endereco + ", email=" + email + "]";
	}

}
