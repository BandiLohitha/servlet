import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeletePerson {

	
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Lohi");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
//		Person p=new Person();
//		p.setId(101);
//		p.setName("chaithu");
//		p.setGender("male");
//		p.setAge(14);
		Person p=em.find(Person.class, 101);
		
		et.begin();
		em.remove(p);
		et.commit();
	}
}
