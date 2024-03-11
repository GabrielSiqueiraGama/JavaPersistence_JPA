package infra;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DAO<E> {

	private static EntityManagerFactory emf;
	private  EntityManager em;
	private Class<E> classe;
	
	static {
		try {
			emf = Persistence.createEntityManagerFactory("estudo_java");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public DAO() {
		this(null);
	}
	
	public DAO(Class<E> classe) {
		this.classe = classe;
		em = emf.createEntityManager();
	}
	
	public DAO<E> abrirT(){
		em.getTransaction().begin();
		return this;
	}
	public DAO<E> fecharT(){
		em.getTransaction().commit();
		return this;
	}
	public DAO<E> incluir(E entidade){
		em.persist(entidade);
		return this;
	}
	public DAO<E> incluirAtomico(E entidade){
		return this.abrirT().incluir(entidade).fecharT();
	}
}
