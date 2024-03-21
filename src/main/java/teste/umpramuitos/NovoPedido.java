package teste.umpramuitos;

import infra.DAO;
import modelo.basico.Produto;
import modelo.umParamuitos.ItemPedido;
import modelo.umParamuitos.Pedido;

public class NovoPedido {

	public static void main(String[] args) {
		
		Pedido pedido = new Pedido();
		Produto produto = new Produto("Geladeira inox", 2999.99);
		ItemPedido item = new ItemPedido(pedido, produto, 10);
		
		DAO<Object> dao = new DAO<>();
		
		dao.abrirT()
			.incluir(produto)
			.incluir(pedido)
			.incluir(item)
			.fecharT()
			.fechar();
	}
	
}
