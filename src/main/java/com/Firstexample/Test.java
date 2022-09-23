package com.Firstexample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
public static void main(String[] args) {
	SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	
	Student student=new Student();
	student.setId(1);
	student.setName("Salman");
	student.setAddress("Basti");
	
	Student student1=new Student();
	student1.setId(2);
	student1.setName("Rahman");
	student1.setAddress("Khalilabad");
	
	Student student2=new Student();
	student2.setId(3);
	student2.setName("Aman Khan");
	student2.setAddress("Mumbai");
	
	Student student3=new Student();
	student3.setId(4);
	student3.setName("Arkam");
	student3.setAddress("Mumbara");
	
	Session session=factory.openSession();
	Transaction tx=session.beginTransaction();
	session.save(student);
	session.save(student1);
	session.save(student2);
	session.save(student3);
	tx.commit();
	session.close();
	factory.close();
	
	System.out.println("data is inserted");
}
}
