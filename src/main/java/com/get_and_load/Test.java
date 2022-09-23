package com.get_and_load;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Firstexample.Student;

public class Test {
public static void main(String[] args) {
	SessionFactory factory=new Configuration().configure().buildSessionFactory();
	Session session=factory.openSession();
	
	Student student=session.get(Student.class,3);
	Student student1=session.load(Student.class,4); 
	 Student student2=session.get(Student.class,3);
	System.out.println(student);
	System.out.println(student1);
	System.out.println(student2);
	System.out.println(session.contains(student));
	session.close();
	factory.close(); 
}
}
