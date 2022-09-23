package com.one_to_one;

import javax.persistence.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Demo {
public static void main(String[] args) {
	SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	/*
	 * Session session=factory.openSession(); 
	 * Transaction
	 * tx=session.beginTransaction();
	 */
	//creating question
	Question q1=new Question();
	q1.setQuestion_id(1313);
	q1.setQuestion_name("who is Virat");
	
	Answer a1=new Answer();
	a1.setAnswer_id(1313);
	a1.setAnswer_name("indian cricket player");
	q1.setAnswer(a1);
	//creating question
	Question q2=new Question();
	q2.setQuestion_id(1314);
	q2.setQuestion_name("what is java programming language");
	
	//creating Answer
	Answer a2=new Answer();
	a2.setAnswer_id(1414);
	a2.setAnswer_name("yes java is a progarmming language");
	
	q2.setAnswer(a2);
	
	
	  Session session=factory.openSession();
	   Transaction tx=session.beginTransaction();
	
	   session.save(a1);
		session.save(q1);
	   
	session.save(a2);
	session.save(q2);
	
	tx.commit();
	session.close();
	factory.close();
	
	System.out.println("data is inserted");
}
}
