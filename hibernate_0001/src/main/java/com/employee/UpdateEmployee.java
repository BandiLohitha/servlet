package com.employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateEmployee {

	
	public static void main(String[] args)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Lohi");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Employee e=new Employee(211,"Sailaja",100,1500);
		//(or)//
//		e.setCid(201);
//		e.setEname("Loki");
//		e.setDeptno(60);
//		e.setSal(70000);
		
		
		et.begin();
		em.merge(e);
		et.commit();
	}
	}

