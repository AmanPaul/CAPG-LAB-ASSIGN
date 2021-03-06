package com;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private int empid;
	private String name;
	private String phone;
	private String dept;
	public Employee() {
		
	}
	
	
	public Employee(int empid, String name, String phone, String dept) {
		super();
		this.empid = empid;
		this.name = name;
		this.phone = phone;
		this.dept = dept;
	}


	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
		
}
