package com.tut.HibernateD;

import java.util.Date;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestAddress {
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session session= factory.openSession();
		
		org.hibernate.Transaction tx=session.beginTransaction();
		
		Address ad=new Address();
		ad.setCity("Akola");
		ad.setOpen(true);
		ad.setStreet("street4");
		ad.setX(12457);
		ad.setDate(new Date());
		
		
		Student stu=new Student();
		stu.setId(1030);
		stu.setName("Shubham Masane");
		stu.setMobile_num(984567954L);
		stu.setCity("Akola");
		
		
		session.save(ad);
		session.save(stu);
		tx.commit();
		session.close();
	}

}
