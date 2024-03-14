package teste.umpraum;

import infra.DAO;
import modelo.umParaum.Assento;
import modelo.umParaum.Cliente;

public class NovoClienteAssento {

	public static void main(String[] args) {
		
		DAO<Object> dao = new DAO<>();
		
		Assento assento = new Assento("1A");
		Cliente cliente = new Cliente("Carlos", assento);
		
		dao.abrirT()
			.incluir(assento)
			.incluir(cliente)
				.fecharT()
					.fechar();
		
	}
	
}
