package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class GerenciarUsuario {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("estudo_java");
		EntityManager em = emf.createEntityManager();
		
		Usuario usuarioTeste = new Usuario("cuca", "s2s4@gmail.com");
		
		em.getTransaction().begin();
		em.persist(usuarioTeste);
		em.getTransaction().commit();
		
		emf.close();
		em.close();
	}
	
}
