package com.one_to_many;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Ans {
	@Id
	private int ansid;
	private String ans;

	@ManyToOne
	private Ques ques;

	public int getAnsid() {
		return ansid;
	}

	public void setAnsid(int ansid) {
		this.ansid = ansid;
	}

	public String getAns() {
		return ans;
	}

	public void setAns(String ans) {
		this.ans = ans;
	}

	public Ques getQues() {
		return ques;
	}

	public void setQues(Ques ques) {
		this.ques = ques;
	}

	public Ans(int ansid, String ans, Ques ques) {
		super();
		this.ansid = ansid;
		this.ans = ans;
		this.ques = ques;
	}

	public Ans() {
		super();
		// TODO Auto-generated constructor stub
	}

}
