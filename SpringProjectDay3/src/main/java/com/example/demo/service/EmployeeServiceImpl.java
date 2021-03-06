package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Employee;
import com.example.demo.dao.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeDao edao;

	@Override
	public List<Employee> printAllEmployee() {
		// TODO Auto-generated method stub
		return edao.getAllEmployee();
	}

	@Override
	public Employee findEmployee(int empid) {		
		return edao.findEmployee(empid);
	}

	@Override
	public List<Employee> createEmployee(Employee emp) {
		if(emp.getEmpid()==0 || emp.getName()==null)
			return null;
		else
			return edao.createEmployee(emp);
	}

	@Override
	public List<Employee> removeEmployee(int empid) {
		return edao.deleteEmployee(empid);
	}

	@Override
	public List<Employee> updateEmployee(Employee emp) {
		if(emp.getEmpid()==0)
			return null;
		else
			return edao.updateEmployee(emp);
	}

}
