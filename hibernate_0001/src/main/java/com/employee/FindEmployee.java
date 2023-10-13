package com.employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindEmployee {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Lohi");
		EntityManager em=emf.createEntityManager();
		
		Employee e=em.find(Employee.class,211);
		System.out.println(e.getCid());
		System.out.println(e.getEname());
		System.out.println(e.getDeptno());
		System.out.println(e.getSal());
		
		
	}
}
