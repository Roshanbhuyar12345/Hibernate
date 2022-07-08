package com.tut.HibernateD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchData {
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		
		cfg.configure();
		
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session session=factory.openSession();
		
		
		//Student stud=(Student)session.get(Student.class, 1010);
	    //System.out.println(stud);
		
		Student stud=(Student)session.load(Student.class, 1010);
		System.out.println(stud.getName()+" : "+stud.getCity());
		
	}

}
