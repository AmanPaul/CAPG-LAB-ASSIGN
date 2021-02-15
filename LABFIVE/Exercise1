package labFive;
import java.util.Scanner;

class AgeException extends Exception {
	 
	 public AgeException(String s) {
	  System.out.println(s);
	 }
	}
public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner sc=new Scanner(System.in);
		age=sc.nextInt();
		sc.close();
		try {
			if(age<16)
				throw new AgeException("Age of a person should be above 15");
			else
				System.out.println("Valid age");
			
		}
		
		catch(AgeException e)
		{
			System.out.println(e);
		}

	}

}
