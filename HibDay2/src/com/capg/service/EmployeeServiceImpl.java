package com.capg.service;
import java.util.List;

import com.capg.dao.EmployeeDao;
import com.capg.dao.EmployeeDaoImpl;
import com.capg.pojo.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	
	EmployeeDao edao=new EmployeeDaoImpl();
	
	@Override
	public String createEmployee(Employee emp) {
		if(emp.getName().length()<4 || emp.getSalary()<20000)
			return "Invalid Employee Data";
		else
			return edao.saveEmployee(emp);
	}
	@Override
	public Employee findEmployee(int empid) {
		return edao.findEmployee(empid);
	}
	@Override
	public String updateEmployee(Employee emp) {
		return edao.updateEmployee(emp);
	}
	@Override
	public String removeEmployee(int empid) {
		return edao.removeEmployee(empid);
	}
	@Override
	public List<Employee> getAllEmployee() {
		return edao.getAllEmployee();
	}
}
