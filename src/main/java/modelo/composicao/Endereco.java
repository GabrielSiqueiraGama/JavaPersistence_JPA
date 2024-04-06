package modelo.composicao;

import javax.persistence.Embeddable;

@Embeddable
public class Endereco {

	private String logadouro;
	private String complemento;
	
	public String getLogadouro() {
		return logadouro;
	}
	
	public void setLogadouro(String logadouro) {
		this.logadouro = logadouro;
	}
	
	public String getComplemento() {
		return complemento;
	}
	
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	
	
}
