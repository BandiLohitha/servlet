package com.org.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.org.dto.Bike;

public class BikeCURD {

	public static void saveBike(Bike b)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("chaithu");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		et.begin();
		em.persist(b);
		et.commit();
	}
		public static List<Bike> getBikes()
		{
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("chaithu");
			EntityManager em=emf.createEntityManager();	
			Query q=em.createQuery("FROM Bike");
			return q.getResultList();
		}
	

	
	}

