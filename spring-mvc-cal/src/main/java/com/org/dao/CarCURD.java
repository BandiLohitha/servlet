package com.org.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.org.dto.Car;

public class CarCURD {

	
	public static void saveCar(Car c)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("chaithu");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		
		et.begin();
		em.persist(c);
		et.commit();
	}
}
