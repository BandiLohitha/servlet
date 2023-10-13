import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class FindAllPersons {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Lohi");
	EntityManager em=emf.createEntityManager();
	
	String hql="SELECT p FROM Person p";
	Query q=em.createQuery(hql);
	List<Person> p=q.getResultList();
	
	for(Person b:p)
	{
		System.out.println(b.getId());
		System.out.println(b.getName());
		System.out.println(b.getAge());
		System.out.println(b.getGender());
		System.out.println("------------------------------");
		
	}
}
}
