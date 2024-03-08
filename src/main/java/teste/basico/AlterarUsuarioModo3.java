package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuarioModo3 {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("estudo_java");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 3L);
		usuario.setNome("Romario");
		em.detach(usuario);
		
		//em.merge(usuario);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();

	}

}
