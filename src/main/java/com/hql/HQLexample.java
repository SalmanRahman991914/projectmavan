package com.hql;


import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class HQLexample {
public static void main(String[] args) {

SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

Session s=factory.openSession();
Transaction tx=s.beginTransaction();

 String query=("From Student");
 Query q= s.createQuery(query);
 List<com.Firstexample.Student>list=q.list();
 for(com.Firstexample.Student student:list) {
	 System.out.println(student);
 }
 
	  //Deleting data
		
		  Query q2=s.createQuery("delete from Student where id=18");
		  int r=q2.executeUpdate();
		  System.out.println("data deleted");
		  System.out.println(r);
		 
		 
	 
		
		  //updating query Query
			
			  Query q3=s.createQuery("update Student set name='Rashiqe mustani' where id=108"); int
			  r1=q3.executeUpdate(); System.out.println("data is updated");
			  System.out.println(r1);
			  
			 
	  //inserting data Query
		
		/*
		 * Query q4=s.createQuery("insert into First values(19,'Salman','lucknow')");
		 * int r2= q4.executeUpdate();
		 *  System.out.println("data is inserted");
		 * System.out.println(r2);
		 */
 
		
		tx.commit(); 
s.close();
factory.close();
}
}

