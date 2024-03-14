package teste.umpraum;

import infra.DAO;
import modelo.umParaum.Assento;
import modelo.umParaum.Cliente;

public class NovoClienteComDao {

	public static void main(String[] args) {
		
		DAO<Cliente> dao = new DAO<>(Cliente.class);
		
		Assento assento = new Assento("2A");
		Cliente cliente = new Cliente("José", assento);
		
		dao.incluirAtomico(cliente);
	}
	
}
