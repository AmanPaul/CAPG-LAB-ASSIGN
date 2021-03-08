package com.capg.pl;

import java.util.Scanner;

import com.capg.pojo.Author;
import com.capg.service.AuthorService;
import com.capg.service.AuthorServiceImpl;

public class AuthorMain {
	
	public static void main(String[] args) {
		
		AuthorService es=new AuthorServiceImpl();
		System.out.println("1: For new employee");
		System.out.println("2: For delete employee");
		System.out.println("3: For update employee");
		
		Scanner sc=new Scanner(System.in);
		String repeat="Yes";
		while(repeat.equalsIgnoreCase("yes")) {
			System.out.println("Enter Your Choice");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:
				//System.out.println("Enter Id");
				//int id=sc.nextInt();
				System.out.println("Enter first Name");
				String fname=sc.next();
				System.out.println("Enter middle Name");
				String mname=sc.next();
				System.out.println("Enter last Name");
				String lname=sc.next();
				System.out.println("Enter Phone");
				int phone=sc.nextInt();
				System.out.println(es.createAuthor(new Author(fname,mname,lname,phone)));
				break;
			case 2:
				System.out.println("Enter Employee ID to Delete");
				int eid1=sc.nextInt();
				System.out.println(es.removeAuthor(eid1));
				break;
			case 3:
				System.out.println("Enter Employee ID to Update");
				int eid2=sc.nextInt();
				System.out.println("Enter name....");
				String n=sc.next();
				Author aut=new Author();
				aut.setAuthorId(eid2);
				aut.setFirstName(n);
				System.out.println(es.updateAuthor(aut));
				break;
	
			default:
				System.out.println("Wrong choice");
			}
			System.out.println("Do you want to continue Yes/No");
			repeat=sc.next();
	}

}
}
