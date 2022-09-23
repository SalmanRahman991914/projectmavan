package com.tut;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Anss {
@Id
private int a_id;
private String a_name;
@ManyToMany
private List<Quess> quess;
public int getA_id() {
	return a_id;
}
public void setA_id(int a_id) {
	this.a_id = a_id;
}
public String getA_name() {
	return a_name;
}
public void setA_name(String a_name) {
	this.a_name = a_name;
}
public List<Quess> getQuess() {
	return quess;
}
public void setQuess(List<Quess> quess) {
	this.quess = quess;
}
public Anss(int a_id, String a_name, List<Quess> quess) {
	super();
	this.a_id = a_id;
	this.a_name = a_name;
	this.quess = quess;
}
public Anss() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Anss [a_id=" + a_id + ", a_name=" + a_name + ", quess=" + quess + "]";
}


}
