package com.one_to_one;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Question {
	@Id
private int Question_id;
private String Question_name;
@OneToOne
private  Answer answer;

public int getQuestion_id() {
	return Question_id;
}

public void setQuestion_id(int question_id) {
	Question_id = question_id;
}

public String getQuestion_name() {
	return Question_name;
}

public void setQuestion_name(String question_name) {
	Question_name = question_name;
}



  public Answer getAnswer() { 
	  return answer; }
  
  
  public void setAnswer(Answer answer) { this.answer = answer; }
  
  public Question(int question_id, String question_name, Answer answer) {
  super(); Question_id = question_id; Question_name = question_name;
  this.answer = answer; }
 
public Question() {
	super();
	// TODO Auto-generated constructor stub
}


  @Override public String toString() { return "Question [Question_id=" +
  Question_id + ", Question_name=" + Question_name + ", answer=" + answer +
  "]"; }



}
