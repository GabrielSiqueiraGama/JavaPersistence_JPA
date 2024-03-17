package teste.umpraum;

import infra.DAO;
import modelo.umParaum.Assento;
import modelo.umParaum.Cliente;

public class NovoClienteAssento {

	public static void main(String[] args) {
		
		DAO<Object> dao = new DAO<>();
		
		Assento assento1 = new Assento("1A");
		Assento assento2 = new Assento("2A");
		Assento assento3 = new Assento("3A");
		Assento assento4 = new Assento("4A");
		
		Cliente cliente1 = new Cliente("Carlos", assento1);
		Cliente cliente2 = new Cliente("Adoninas", assento2);
		Cliente cliente3 = new Cliente("Peléz", assento3);
		Cliente cliente4 = new Cliente("Ronallinho", assento4);
		
		dao.abrirT()
			.incluir(assento1)
			.incluir(assento2)
			.incluir(assento3)
			.incluir(assento4)
			.incluir(cliente1)
			.incluir(cliente2)
			.incluir(cliente3)
			.incluir(cliente4)
				.fecharT()
					.fechar();
		
	}
	
}
