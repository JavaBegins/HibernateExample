package com.lti.HibernateExample.HibernateExp;

public class Employee 
{
private int id;
private String empname;
private String branch;
public Employee(){}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
public Employee(int id, String empname, String branch) {
	super();
	this.id = id;
	this.empname = empname;
	this.branch = branch;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", empname=" + empname + ", branch=" + branch + "]";
}


}
