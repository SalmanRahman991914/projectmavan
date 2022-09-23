package com.chache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Firstexample.Student;



public class Test1 {
public static void main(String[] args) {
	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
Session session = factory.openSession();
Student student = session.get(Student.class,1);


System.out.println(student);
session.close();
factory.close();
}
}
