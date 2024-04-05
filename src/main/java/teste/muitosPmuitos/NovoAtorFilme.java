package teste.muitosPmuitos;

import infra.DAO;
import modelo.muitosPmuitos.Ator;
import modelo.muitosPmuitos.Filme;

public class NovoAtorFilme {

	public static void main(String[] args) {
		
		Filme filme1 = new Filme("A ida dos que não foram", 10.0);
		Filme filme2 = new Filme("Esses foram", 6.0);
		Filme filme3 = new Filme("Fogo em alto mar", 8.0);
		Filme filme4 = new Filme("A ida dos que não foram", 7.5);
		
		Ator ator1 = new Ator("Ronaldo fenomeno");
		Ator ator2 = new Ator("Garrincha");
		Ator ator3 = new Ator("Pelé");
		Ator ator4 = new Ator("Gaucho");
		
		filme1.adicionarAtor(ator1);
		filme2.adicionarAtor(ator1);
		filme3.adicionarAtor(ator3);
		filme4.adicionarAtor(ator4);
		filme1.adicionarAtor(ator2);
		
		DAO<Filme> dao = new DAO<Filme>();
		dao.incluirAtomico(filme1);
		dao.incluirAtomico(filme2);
		dao.incluirAtomico(filme3);
		dao.incluirAtomico(filme4);
		
	}
	
}
