package com.many_to_many;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Emp {
	@Id
 private int emp;
 private String name;
 
 
 @ManyToMany
 private List<Project>projects;
public int getEmp() {
	return emp;
}
public void setEmp(int emp) {
	this.emp = emp;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<Project> getProjects() {
	return projects;
}
public void setProjects(List<Project> projects) {
	this.projects = projects;
}
public Emp(int emp, String name, List<Project> projects) {
	super();
	this.emp = emp;
	this.name = name;
	this.projects = projects;
}
public Emp() {
	super();
	// TODO Auto-generated constructor stub
}
}

