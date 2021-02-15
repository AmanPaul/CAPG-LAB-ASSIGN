package labFive;
import java.util.*;

class SalException extends Exception {
	 
	 public SalException(String s) {
	  System.out.println(s);
	 }
	}
public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee name:");
		s=sc.next();
		
		double sal;
		System.out.println("Enter Employee salary:");
		sal=sc.nextDouble();
		
		try {
			if(sal<10000)
				System.out.println("Salary is below 10000");
			else
				System.out.println("Salary greater than 10000");
		}
		
		catch (Exception e) {
			System.out.println(e);
		}

	}

}
