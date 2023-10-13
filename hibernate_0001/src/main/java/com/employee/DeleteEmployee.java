package com.employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteEmployee {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Lohi");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		
		Employee e=em.find(Employee.class,202);
		
		e.setCid(202);
		e.setEname("Lasya");
		e.setDeptno(20);
		e.setSal(55000);
		
		
		et.begin();
		em.remove(e);
		et.commit();
	}
}
