package com.hql;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tut.HibernateD.Student;

public class HQLExample {
	public static void main(String[] args) {

		Configuration cfg = new Configuration().configure();

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		String query = "from Student";

		org.hibernate.Query q = session.createQuery(query);

		List<Student> list = q.list();

		for(Student stud:list) {
			System.out.println(stud.getName()+" : "+stud.getCerti().getCourse());
		}
		
		
		
		session.close();
		factory.close();
	}

}
