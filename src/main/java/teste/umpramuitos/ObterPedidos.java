package teste.umpramuitos;

import infra.DAO;
import modelo.umParamuitos.ItemPedido;
import modelo.umParamuitos.Pedido;

public class ObterPedidos {

	public static void main(String[] args) {
		
		DAO<Pedido> dao = new DAO<>(Pedido.class);
		
		Pedido pedido = dao.obterPorId(1L);
		
		for(ItemPedido item: pedido.getItens()) {
			System.out.println(item.getQuantidade());
			System.out.println(item.getProduto().getNome());
		}
		
		dao.fechar();
		
	}
	
}
