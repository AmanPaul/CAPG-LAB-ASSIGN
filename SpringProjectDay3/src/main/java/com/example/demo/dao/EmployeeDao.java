package com.example.demo.dao;

import java.util.List;

import com.example.demo.bean.Employee;

public interface EmployeeDao {
	public List<Employee> getAllEmployee();
	public Employee findEmployee(int empid);
	public List<Employee> createEmployee(Employee emp);
	public List<Employee> deleteEmployee(int empid);
	public List<Employee> updateEmployee(Employee emp); 
}
