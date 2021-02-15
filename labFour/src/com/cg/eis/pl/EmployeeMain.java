package com.cg.eis.pl;
import java.util.*;
import com.cg.eis.service.Service;
public class EmployeeMain {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter Employee Id");
		String eid = sc.nextLine();
		System.out.println("Please enter Employee Name");
		String ename = sc.nextLine();
		System.out.println("Please enter Employee Designation");
		String edesig = sc.nextLine();
		System.out.println("Please enter Employee Salary");
		double esal = sc.nextDouble();
		sc.close();
		
		Service s=new Service();
		s.input(eid,ename,esal,edesig);
		s.display();
		s.insurance(esal);
		
		
	}

}
