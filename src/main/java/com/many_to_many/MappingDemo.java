package com.many_to_many;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingDemo {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Emp e1 = new Emp();
		Emp e2 = new Emp();
		Emp e3 = new Emp();

		e1.setEmp(34);
		e1.setName("Salman");

		e2.setEmp(35);
		e2.setName("Rahman");

		e3.setEmp(36);
		e3.setName("Amir");

		Project p1 = new Project();
		Project p2 = new Project();
		Project p3 = new Project();
		p1.setPid(12121);
		p1.setProjectName("Fee managment system");

		p2.setPid(14214);
		p2.setProjectName("Note Taker");

		p3.setPid(121);
		p3.setProjectName("Crud Api");

		List<Emp> list1 = new ArrayList<Emp>();
		List<Project> list2 = new ArrayList<Project>();

		list1.add(e1);
		list1.add(e2);

		list2.add(p1);
		list2.add(p2);

		e3.setProjects(list2);
		p3.setEmp(list1);
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();

		s.save(e1);
		s.save(e2);
		s.save(e3);
		s.save(p1);
		s.save(p2);
		s.save(p3);
		tx.commit();
		s.close();
		factory.close();
		System.out.println("data is inserted________");

	}
}
