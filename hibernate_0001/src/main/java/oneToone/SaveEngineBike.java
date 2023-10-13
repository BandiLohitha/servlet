package oneToone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveEngineBike {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Lohi");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		
		Engine e=new Engine();
		e.setEid("101");
		e.setCc(90);
		
		Bike b=new Bike();
		b.setId(1001);
		b.setName("KTM");
		b.setE(e);
		et.begin();
		em.persist(e);
		em.persist(b);
		et.commit();
		
	}
}
