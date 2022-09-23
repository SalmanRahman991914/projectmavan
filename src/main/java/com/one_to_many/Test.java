package com.one_to_many;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Ques ques = new Ques();
		ques.setQuesid(001);
		ques.setQues("what is java");

		Ans ans = new Ans();
		ans.setAnsid(12);
		ans.setAns("programming language");

		ans.setQues(ques);

		Ans ans1 = new Ans();
		ans1.setAnsid(13);
		ans1.setAns("secure programming language ");

		ans1.setQues(ques);

		Ans ans2 = new Ans();
		ans2.setAnsid(14);
		ans2.setAns("object programming");

		ans2.setQues(ques);

		Ans ans3 = new Ans();
		ans3.setAnsid(15);
		ans3.setAns("Dynemic programing");

		ans3.setQues(ques);

		List<Ans> list = new ArrayList<Ans>();
		list.add(ans);
		list.add(ans1);
		list.add(ans2);
		list.add(ans3);

		ques.setAns(list);

		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
		s.save(ques);

		s.save(ans);
		s.save(ans1);
		s.save(ans2);
		s.save(ans3);

		tx.commit();
		s.close();
		factory.close();
		System.out.println("data inserted____________");
	}
}
