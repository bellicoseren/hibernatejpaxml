package mx.edu.uacm;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import mx.edu.uacm.dominio.Usuario;



public class Main {

	public static void main(String[] args) {
    	EntityManagerFactory factory = Persistence.createEntityManagerFactory("hibernatejpaxml");
        EntityManager em = factory.createEntityManager();
        
        em.getTransaction().begin();
        
        Usuario user1 = new Usuario();
//        user1.setId(1L);
        user1.setNombreUsuario("Bellicose");
        user1.setMensajeUsuario("Mensaje enviado de usuario 1");
        
        em.persist(user1);
        
        em.getTransaction().commit();
        
        em.close();
	}

}
