package com.one_to_one;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer {
	@Id
private int Answer_id;
private String Answer_name;
@OneToOne
private Question question;

public int getAnswer_id() {
	return Answer_id;
}
public void setAnswer_id(int answer_id) {
	Answer_id = answer_id;
}
public String getAnswer_name() {
	return Answer_name;
}
public void setAnswer_name(String answer_name) {
	Answer_name = answer_name;
}
public Answer(int answer_id, String answer_name) {
	super();
	Answer_id = answer_id;
	Answer_name = answer_name;
}
public Answer() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Answer [Answer_id=" + Answer_id + ", Answer_name=" + Answer_name + "]";
}

}
