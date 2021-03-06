package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeMain {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("cap");
		EntityManager en=factory.createEntityManager();
		EntityTransaction tx=en.getTransaction();
		tx.begin();
		Employee emp=new Employee(102,"Mr. Y","986524165","Java");
		en.persist(emp);
		tx.commit();
		System.out.println("Employee created....");
		en.close();
		factory.close();
	}

}
 