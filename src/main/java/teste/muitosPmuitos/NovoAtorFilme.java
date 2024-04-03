package teste.muitosPmuitos;

import infra.DAO;
import modelo.muitosPmuitos.Ator;
import modelo.muitosPmuitos.Filme;

public class NovoAtorFilme {

	public static void main(String[] args) {
		
		Filme filme1 = new Filme("A ida dos que não foram", 10.0);
		Filme filme2 = new Filme("Esses foram", 6.0);
		
		Ator ator1 = new Ator("Ronaldo fenomeno");
		Ator ator2 = new Ator("Garrincha");
		
		filme1.adicionarAtor(ator1);
		filme2.adicionarAtor(ator1);
		
		filme1.adicionarAtor(ator2);
		
		DAO<Filme> dao = new DAO<Filme>();
		dao.incluirAtomico(filme1);
		
	}
	
}
