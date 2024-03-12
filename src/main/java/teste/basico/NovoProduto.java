package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

public class NovoProduto {

	public static void main(String[] args) {
		
		Produto produto = new Produto("Tablet", 3500.30);
		
		DAO<Produto> dao = new DAO<Produto>(Produto.class);
		
		//dao.abrirT().incluir(produto).fecharT().fechar();
		dao.incluirAtomico(produto).fechar();
		System.out.println("Id do produto: " + produto.getId());
	}
	
}
