package modelo.muitosPmuitos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Sobrinho {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	@ManyToMany(mappedBy = "sobrinhos")
	private List<Tio> tios = new ArrayList<>();

	public Sobrinho() {}
	
	
	
	public Sobrinho(String name) {
		this.name = name;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Tio> getTios() {
		return tios;
	}

	public void setTios(List<Tio> tios) {
		this.tios = tios;
	}
	
	
}
