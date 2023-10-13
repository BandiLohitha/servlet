package com.employee;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindAllEmployee
{

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Lohi");
		EntityManager em=emf.createEntityManager();
		
		String hql="SELECT e FROM Employee e";
		Query q=em.createQuery(hql);
		List<Employee> p=q.getResultList();
		
		for(Employee e1:p)
			
		{
			System.out.println(e1.getCid());
			System.out.println(e1.getEname());
			System.out.println(e1.getSal());
			System.out.println(e1.getDeptno());
			System.out.println("------------------------------");
		}
	}
}
