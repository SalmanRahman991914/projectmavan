package com.chaching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Firstexample.Student;

public class First_level_chache {
public static void main(String[] args) {
	SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	Session session=factory.openSession(); 
	
	Student student=session.get(Student.class,1);
	Student student1=session.load(Student.class,2);
	System.out.println(student);
	System.out.println(student1);
	System.out.println(student);
	System.out.println(session.contains(student));
	session.close();
	factory.close();
}
}
