package com.tut.HibernateD;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CertificateDemo {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();

		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();

		org.hibernate.Transaction tx = session.beginTransaction();

		Student stud = new Student();

		stud.setId(1234);
		stud.setName("Kalpesh Bhonde");
		stud.setCity("Delhi");
		stud.setMobile_num(548795678);

		Certificate certificate = new Certificate();

		certificate.setCourse("Java");
		certificate.setDuration(2);

		stud.setCerti(certificate);

		Student stud1 = new Student();

		stud1.setId(12345);
		stud1.setName("Sameer joshi");
		stud1.setCity("Lakhanow");
		stud1.setMobile_num(548955678);

		Certificate certificate1 = new Certificate();

		certificate1.setCourse("python");
		certificate1.setDuration(3);

		stud1.setCerti(certificate1);

		session.save(stud);
		session.save(stud1);

		tx.commit();
		session.close();
	}

}
