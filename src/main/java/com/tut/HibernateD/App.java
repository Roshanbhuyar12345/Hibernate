package com.tut.HibernateD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure().addAnnotatedClass(Student.class);
		
		SessionFactory factory=cfg.buildSessionFactory();
		 
		Session session= factory.openSession();
		
		org.hibernate.Transaction tx=session.beginTransaction();
		
		//Student stud=new Student(101,"nakul","amravati",545885545);
		
		//session.save(stud);
		tx.commit();
		session.close();
	}
   
}
