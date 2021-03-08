package com.capg.pl;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.capg.pojo.Employee;
import com.capg.service.EmployeeService;
import com.capg.service.EmployeeServiceImpl;

public class EmployeeMain {

	public static void main(String[] args) {
		EmployeeService es=new EmployeeServiceImpl();
		
		System.out.println("1: For new employee");
		System.out.println("2: For search employee");
		System.out.println("3: For delete employee");
		System.out.println("4: For update employee");
		System.out.println("5: For get all employee");
		
		Scanner sc=new Scanner(System.in);
		String repeat="Yes";
		while(repeat.equalsIgnoreCase("yes")) {
			System.out.println("Enter Your Choice");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter Name");
				String name=sc.next();
				System.out.println("Enter Salary");
				double salary=sc.nextDouble();
				System.out.println(es.createEmployee(new Employee(name,salary,new Date())));
				break;
			case 2:
				System.out.println("Enter Employee ID to Find");
				int eid=sc.nextInt();
				Employee e=es.findEmployee(eid);
				if(e!=null)
					System.out.println(e);
				else
					System.out.println("Employee not found");
					break;
			case 3:
				System.out.println("Enter Employee ID to Delete");
				int eid1=sc.nextInt();
				System.out.println(es.removeEmployee(eid1));
				break;
			case 4:
				System.out.println("Enter Employee ID to Update");
				int eid2=sc.nextInt();
				System.out.println("Enter name....");
				String n=sc.next();
				Employee emp=new Employee();
				emp.setEmpid(eid2);
				emp.setName(n);
				System.out.println(es.updateEmployee(emp));
				break;
			case 5:
				List<Employee> li=es.getAllEmployee();
				for(Employee em:li) {
					System.out.println(em);
				}
				break;
			default:
				System.out.println("Wrong choice");
			}
			System.out.println("Do you want to continue Yes/No");
			repeat=sc.next();
		}
	}

}