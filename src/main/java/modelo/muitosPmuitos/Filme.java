package modelo.muitosPmuitos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "filmes")
public class Filme {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private double nota;
	
	@ManyToMany
	@JoinTable(
			name = "atores_filmes",
			joinColumns = @JoinColumn(name = "filme_id", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name = "ator_id", referencedColumnName = "id")
	)
	private List<Ator> atores = new ArrayList<>();

	public Filme() {}
	
	public Filme(String nome, double nota) {
		this.nome = nome;
		this.nota = nota;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public List<Ator> getAtores() {
		return atores;
	}

	public void setAtores(List<Ator> atores) {
		this.atores = atores;
	}
	
	public void adicionarAtor(Ator ator) {
		if(ator != null && !getAtores().contains(ator)) {
			getAtores().add(ator);
			if(ator.getFilmes().contains(this)) {
				ator.getFilmes().add(this);
			}
		}
	}
	
}
