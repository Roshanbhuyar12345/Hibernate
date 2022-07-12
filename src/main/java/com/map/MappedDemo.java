																																																																																																																																																																																																													package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MappedDemo {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();

		Question question = new Question();
		question.setQuetionId(101);
		question.setQuetion("what is java ?");

		Answer ans = new Answer();
		ans.setAnswerId(123);
		ans.setAnswer("java is programming languege.");
		question.setAnswer(ans);

		Question question1 = new Question();
		question1.setQuetionId(102);
		question1.setQuetion("what is collection?");

		Answer ans1 = new Answer();
		ans1.setAnswerId(1234);
		ans1.setAnswer("API to perform operations on objects.");
		question1.setAnswer(ans1);

		Session session = factory.openSession();
		org.hibernate.Transaction tx = session.beginTransaction();

		session.save(question);
		session.save(ans);

		session.save(question1);
		session.save(ans1);

		tx.commit();
		
		Question q=(Question)session.get(Question.class, 101);
		System.out.println(q.getQuetion());
		System.out.println(q.getAnswer());
		
		
		
		session.close();
		factory.close();

	}

}
