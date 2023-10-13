package hibernate_0002;

import java.util.List;
import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveStudentCourse {

	public static void main(String[] args) 
	{
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Lohi");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	
	Student s1=new Student();
	s1.setSid(201);
	s1.setName("Lohitha");
	
	Student s2=new Student();
	s2.setSid(202);
	s2.setName("Lasitha");
	
	Course c1=new Course();
	c1.setCid(01);
	c1.setSub("Java");
	
	Course c2=new Course();
	c2.setCid(02);
	c2.setSub("JS");

	Course c3=new Course();
	c3.setCid(03);
	c3.setSub("SQL");

	Course c4=new Course();
	c4.setCid(04);
	c4.setSub("HTML");

	List<Course> courses1=new ArrayList<Course>();
	courses1.add(c1);
	courses1.add(c3);
	courses1.add(c4);
	
	s1.setCourses(courses1);
	
	List<Course> courses2=new ArrayList<Course>();
	courses2.add(c2);
	courses2.add(c3);
	
	s2.setCourses(courses2);
	
	List<Student> students1=new ArrayList<Student>();
	students1.add(s1);
	c1.setStudents(students1);
	
	List<Student> students2=new ArrayList<Student>();
	students2.add(s2);
	
	
	c2.setStudents(students2);
	
	List<Student> students3=new ArrayList<Student>();
	students3.add(s1);
	students2.add(s2);
	
	c3.setStudents(students3);
	
	List<Student> students4=new ArrayList<Student>();
	students4.add(s1);
	
	c4.setStudents(students4);

	
	et.begin();
	em.persist(s1);
	em.persist(s2);
	em.persist(c1);
	em.persist(c2);
	em.persist(c3);
	em.persist(c4);
	et.commit();
	
	}
}
