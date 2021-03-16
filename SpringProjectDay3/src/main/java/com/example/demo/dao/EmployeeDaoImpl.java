package com.example.demo.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.bean.Employee;
@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	private static List<Employee> empList;
	static {
		empList=new ArrayList<Employee>();
		empList.add(new Employee(101, "Aman", 56000,LocalDate.parse("1990-02-01")));
		empList.add(new Employee(102, "Sanjay", 66000,LocalDate.parse("1992-10-12")));
		empList.add(new Employee(103, "Amit", 76000,LocalDate.parse("1995-09-25")));
		empList.add(new Employee(104, "Rahul", 96000,LocalDate.parse("1996-02-14")));
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		return empList;
	}

	@Override
	public Employee findEmployee(int empid) {
		for(Employee e:empList) {
			if(e.getEmpid()==empid) 
				return e;
		}
		return null; //empList.stream().filter(e->e.getEmpid()==empid).collect(Collectors.toList()).get(0);
	}

	@Override
	public List<Employee> createEmployee(Employee emp) {
		empList.add(emp);
		return empList;
	}

	@Override
	public List<Employee> deleteEmployee(int empid) {
		Employee e=findEmployee(empid);
		if(e!=null) {
			empList.remove(e);
			return empList;
		}
		return null;
	}

	@Override
	public List<Employee> updateEmployee(Employee emp) {
		int counter=0;
		for(Employee e:empList) {
			if(e.getEmpid()==emp.getEmpid()) {
				empList.set(counter, emp);
				return empList;
			}
			counter++;
		}
		return null;
	}
}