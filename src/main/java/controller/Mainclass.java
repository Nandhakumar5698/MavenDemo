package controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Courses;
import dto.Student;

public class Mainclass {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Student s1=new Student();
		s1.setStuname("shayam");
		s1.setAge(18);
		
		Student s2=new Student();
		s2.setStuname("reginold");
		s2.setAge(28);
		
		Student s3=new Student();
		s3.setStuname("shayam sekar");
		s3.setAge(38);
		
		List<Student>ls1=new ArrayList<Student>();
		ls1.add(s1);//shayam
		ls1.add(s2);//reginold
		
		List<Student>ls2=new ArrayList<Student>();
		ls2.add(s2);//reginold
		ls2.add(s3);//shayam sekar
		
		
		Courses c1=new Courses();
		c1.setSubject("java");
		
		Courses c2=new Courses();
		c2.setSubject("c programming");
		
		Courses c3=new Courses();
		c3.setSubject("python");
		
		List<Courses>lc1=new ArrayList<Courses>();
		lc1.add(c1);//java
		lc1.add(c2);//c programming
		
		List<Courses>lc2=new ArrayList<Courses>();
		lc2.add(c2);//c programming
		lc2.add(c3);//python
		
		c1.setListofstudent(ls1);//java---->shayam && reginold
		c2.setListofstudent(ls2);//c programming----->reginold && shayam sekar
		
		s1.setListofcourses(lc1);//shayam--->java && c programming
		s2.setListofcourses(lc2);//reginold--->c programming && java
		
		et.begin();
		
		em.persist(s1);
		em.persist(s2);
		em.persist(s3);
		
		em.persist(c1);
		em.persist(c2);
		em.persist(c3);
		
		et.commit();
		
	}
}
