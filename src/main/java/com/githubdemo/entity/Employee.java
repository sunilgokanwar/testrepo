package com.githubdemo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
 
@Id
int eid;
String ename;
int econtact;
String eaddress;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int eid, String ename, int econtact, String eaddress) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.econtact = econtact;
	this.eaddress = eaddress;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public int getEcontact() {
	return econtact;
}
public void setEcontact(int econtact) {
	this.econtact = econtact;
}
public String getEaddress() {
	return eaddress;
}
public void setEaddress(String eaddress) {
	this.eaddress = eaddress;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", econtact=" + econtact + ", eaddress=" + eaddress + "]";
}

}
