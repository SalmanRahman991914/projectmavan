package com.pagination1;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;


import com.Firstexample.*;
public class HQLpagination {
public static void main(String[] args) {
	SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	
	Session session=factory.openSession();
	
Query query=session.createQuery("from Student");
	
	//implementing pagination using hibernate
	  
	  query.setFirstResult(0); 
	  query.setMaxResults(2);
	  List<Student>list1=query.list();
	 
	
	for(Student st:list1) {
	
	//System.out.println(st.getId()+"   "+st.getCity()+"   "+st.getName());
		
 System.out.println(st);   
	
	System.out.println("done");
}
	session.close();
	factory.close();
} 
}