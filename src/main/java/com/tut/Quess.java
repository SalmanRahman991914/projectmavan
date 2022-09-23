package com.tut;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Quess {
@Id
private int q_id;
private String q_name;
@ManyToMany
private List<Anss>anss;
public int getQ_id() {
	return q_id;
}
public void setQ_id(int q_id) {
	this.q_id = q_id;
}
public String getQ_name() {
	return q_name;
}
public void setQ_name(String q_name) {
	this.q_name = q_name;
}
public List<Anss> getAnss() {
	return anss;
}
public void setAnss(List<Anss> anss) {
	this.anss = anss;
}
public Quess(int q_id, String q_name, List<Anss> anss) {
	super();
	this.q_id = q_id;
	this.q_name = q_name;
	this.anss = anss;
}
public Quess() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Quess [q_id=" + q_id + ", q_name=" + q_name + ", anss=" + anss + "]";
}

}
