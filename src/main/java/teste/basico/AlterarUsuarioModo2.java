package teste.basico;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuarioModo2 {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("estudo_java");
		EntityManager em = emf.createEntityManager();
		Scanner scn = new Scanner(System.in);
		
		em.getTransaction().begin();
		Usuario usuario = em.find(Usuario.class, 2L);
		
		usuario.setNome("Seninha");
		

		em.getTransaction().commit();
		
		em.close();
		emf.close();
		scn.close();
	}
}
