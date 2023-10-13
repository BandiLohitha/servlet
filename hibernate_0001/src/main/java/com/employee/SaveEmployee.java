package com.employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveEmployee
{
public static void main(String[] args)
{
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Lohi");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	Employee e=new Employee(211,"Sailu",100,1500);
	//(or)
//	e.setCid(210);
//	e.setEname("Indhu");
//	e.setDeptno(80);
//	e.setSal(7500);
//	
	
	et.begin();
	em.persist(e);
	et.commit();
}
}
