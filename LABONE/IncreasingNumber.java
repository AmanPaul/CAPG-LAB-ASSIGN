package labOne;
import java.util.*;
public class IncreasingNumber {
	public static boolean checkNumber(int number) {
		 boolean flag = false;
		 int currentDigit = number % 10;
		    number = number/10;
		    while(number>0){
		           
		           if(currentDigit <= number % 10){
		               flag = true;
		               break;
		           }

		           currentDigit = number % 10;
		           number = number/10;
		       }
		    if(flag){
		           return false;
		       }
		    else{
		           return true;
		       }
		 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
	    Scanner scanner = new Scanner(System.in);
	     
	    System.out.println("Enter a number : ");
	    int n = scanner.nextInt();
	        
	    System.out.println(checkNumber(n));

	}

}
