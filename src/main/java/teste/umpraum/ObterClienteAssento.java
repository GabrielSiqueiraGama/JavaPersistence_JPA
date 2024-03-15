package teste.umpraum;

import infra.DAO;
import modelo.umParaum.Cliente;

public class ObterClienteAssento {

	public static void main(String[] args) {
		
		DAO<Cliente> dao = new DAO<>(Cliente.class);
		
		Cliente client = dao.obterPorId(1L);
		
		System.out.println("O cliente selecionado está na cadeira: " + client.getAssento().getName());
		
	}
	
}
