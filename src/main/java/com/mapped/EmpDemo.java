package com.mapped;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpDemo {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
        //emp object in transient state
		Employee emp=new Employee();
		emp.setId(123);
		emp.setName("sanket");
		emp.setRole("devloper");
		//emp obj is associate with session
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		emp.setName("rahul");
		
		session.save(emp);
		
		tx.commit();
		//session object is detached 
		session.close();
		factory.close();
		
		
		
	}

}
