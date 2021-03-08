package com.capg.dao;
import java.util.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.capg.config.JPAConfig;
import com.capg.pojo.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	EntityManager eManager=JPAConfig.getEntityManager();
	
	@Override
	public String saveEmployee(Employee emp) {
		EntityTransaction tx=eManager.getTransaction();
		tx.begin();
		eManager.persist(emp);
		tx.commit();
		return "Employee Created.... Your ID is "+emp.getEmpid();
	}
	@Override
	public Employee findEmployee(int empid) {
		
		Employee e=eManager.find(Employee.class, empid);
		return e;
		}
		
	@Override
	public String updateEmployee(Employee emp) {
		
		Employee e=eManager.find(Employee.class, emp.getEmpid());
		if(e!=null) {
			EntityTransaction tx=eManager.getTransaction();
			tx.begin();
			e.setName(emp.getName());
			eManager.merge(e);
			tx.commit();
		return "Employee name updated...";
		
		}
		else
			return "Invalid Employee ID";
		
	}
	@Override
	public String removeEmployee(int empid) {
		
		Employee e=eManager.find(Employee.class, empid);
		if(e!=null) {
			EntityTransaction tx=eManager.getTransaction();
			tx.begin();
			eManager.remove(e);
			tx.commit();
		return "Removed";
		
		}
		else
			return "Invalid Employee ID";
		
	}
	@Override
	public List<Employee> getAllEmployee(){
		Query q=eManager.createQuery("select e from Employee e");
		List<Employee> li=q.getResultList();
		return li;
	}
	
}
