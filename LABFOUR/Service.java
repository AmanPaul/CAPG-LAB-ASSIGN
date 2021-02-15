package com.cg.eis.service;
import com.cg.eis.bean.*;
interface EmployeeServiceInterface {
	
	void insurance(double sal);
	void input(String empid,String name ,double sal,String desig);
	void display();
}

public class Service implements EmployeeServiceInterface {
	
	Employee emp=new Employee();
	
	public void input(String empid,String name,double sal,String desig) {
		emp.setEmpid(empid);
		emp.setName(name);
		emp.setSal(sal);
		emp.setDesig(desig);
	}
	
	public void display() {
		System.out.println("Employee ID : "+emp.getEmpid());
		System.out.println("Name : "+emp.getName());
		System.out.println("Salary : "+emp.getSal());
		System.out.println("Designation : "+emp.getDesig());
	}
	
	public void insurance(double sal) {
		
		int bonus;
		sal=emp.getSal();
		if (sal>=10000 && sal<20000 ) {
			System.out.println("Insurance--->Basic");
			bonus=10000;
			sal+=bonus;
			System.out.println("Salary with bonus--->"+sal);}
		else if (sal>=20000 && sal<30000 ) {
			System.out.println("Insurance--->Standard");
			bonus=20000;
			sal+=bonus;
			System.out.println("Salary with bonus--->"+sal);}
		else if (sal>=30000 && sal<40000 ) {
			System.out.println("Insurance--->Premium");
			bonus=30000;
			sal+=bonus;
			System.out.println("Salary with bonus--->"+sal);}
	}

}