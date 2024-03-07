package teste.basico;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("estudo_java");
		EntityManager em = emf.createEntityManager();
		Scanner scn = new Scanner(System.in);
		
		em.getTransaction().begin();
		Integer idUsuario = scn.nextInt();
		Usuario usuario = em.find(Usuario.class, 2L);
		
		System.out.println("Digite o novo nome: ");
		String novoNome = scn.next();
		
		System.out.println("Digite o novo email: ");
		String novoEmail = scn.next();
		
		usuario.setNome(novoNome);
		usuario.setEmail(novoEmail);
		
		em.merge(usuario);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		scn.close();
	}
	
}
