package com.example.demo.service;

import java.util.List;

import com.example.demo.bean.Employee;

public interface EmployeeService {
	public List<Employee> printAllEmployee();
	public Employee findEmployee(int empid) ;
	public List<Employee> createEmployee(Employee emp);
	public List<Employee> removeEmployee(int empid);
	public List<Employee> updateEmployee(Employee emp) ;
	public List<Employee> findEmployeeByName(String name);
	public List<Employee> findEmployeeBySalary(double salary);
}
