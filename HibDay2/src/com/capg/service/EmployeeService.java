package com.capg.service;

import java.util.List;

import com.capg.pojo.Employee;

public interface EmployeeService {
	public String createEmployee(Employee emp);
	public Employee findEmployee(int empid);
	public String updateEmployee(Employee emp);
	public String removeEmployee(int empid);
	public List <Employee>getAllEmployee();
}