package application;

import dominio.Pessoa;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Program {
	
	public static void main (String[] args) {
		
		Pessoa p1 = new Pessoa(null,"Lucas de Jesus", "lucasjesus12@gmail.com");
		Pessoa p2 = new Pessoa(null,"Tiago Oliveira", "oliveiratiago@gmail.com");
		Pessoa p3 = new Pessoa(null,"Maria Madalena", "mariazinhamada@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
		System.out.println("Pronto!");
	}

}
