package teste.umpraum;

import infra.DAO;
import modelo.umParaum.Assento;
import modelo.umParaum.Cliente;

public class ObterClienteAssento {

	public static void main(String[] args) {
		
		DAO<Cliente> daoCliente = new DAO<>(Cliente.class);
		Cliente cliente = daoCliente.obterPorId(1L);	
		System.out.println("O cliente selecionado está na cadeira: " + cliente.getAssento().getName());
		daoCliente.fechar();
		
		DAO<Assento> daoAssento = new DAO<>(Assento.class);
		Assento assento = daoAssento.obterPorId(1L);
		System.out.println("O cliente sentado na cadeira selecionada é: " + assento.getCliente().getName());
		daoAssento.fechar();
	}
	
}
