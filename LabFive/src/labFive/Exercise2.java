package labFive;
import java.util.Scanner;

class NameException extends Exception {
	 
	 public NameException(String s) {
	  System.out.println(s);
	 }
	}
public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName =new String();
		String lastName =new String();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first name :");
		firstName =sc.nextLine();
		System.out.println("enter last name :");
		lastName =sc.nextLine();
		sc.close();
		
		try {
			if(firstName.isBlank())
				throw new NameException("First Name cannot be blank");
			else
				System.out.println("First Name is valid");
			
			if(lastName.isBlank())
				throw new NameException("Last Name cannot be blank");
			else
				System.out.println("Last Name is valid");
		}
		
		catch(NameException e)
		{
			System.out.println(e);
		}

	}

}
