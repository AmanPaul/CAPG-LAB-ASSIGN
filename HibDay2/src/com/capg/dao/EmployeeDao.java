package com.capg.dao;
import java.util.*;
import com.capg.pojo.Employee;

public interface EmployeeDao {
	public String saveEmployee(Employee emp);
	public Employee findEmployee(int empid);
	public String updateEmployee(Employee emp);
	public String removeEmployee(int empid);
	public List <Employee>getAllEmployee();
}
