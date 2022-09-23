package com.tut;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
public static void main(String[] args) {
	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
//creating ques
	Quess q=new Quess();
	//Quess q1=new Quess();
	q.setQ_id(10);
	q.setQ_name("what is java");
	
	Quess q1=new Quess();
	q1.setQ_id(11);
	q1.setQ_name("what is Servlet");
	
	//creating Ans
	Anss a=new Anss();
	//Anss a1=new Anss();
	
	a.setA_id(12);
	a.setA_name("programing language");
	Anss a1=new Anss();
	a1.setA_id(13);
	a1.setA_name("secure program");
	Session session = factory.openSession();
	
	List<Quess> list=new ArrayList<>();
	List<Anss>list2=new ArrayList<>();
	list.add(q);
	list.add(q1);
	
	list2.add(a);
	list2.add(a1);
	
	Transaction tx = session.beginTransaction();
	session.save(q);
	session.save(q1);
	session.save(a);
	session.save(a1);
	tx.commit();
	session.close();
factory.close();
System.out.println("data is inserted...............");
}
}
