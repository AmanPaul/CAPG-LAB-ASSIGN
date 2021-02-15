package labOne;
import java.util.*;

public class PrimeNumbers {
	
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,num =0;
        String  primeNumbers = "";
        System.out.println("Enter the value :");
        int n = sc.nextInt();
        sc.close();
        for (i = 1; i <= n; i++)  	   
        { 		 		  
           int counter=0; 		  
           for(num =i; num>=1; num--)
           {
  	    if(i%num==0)
  	    {
  		counter = counter + 1;
  	    }
  	 }
  	 if (counter ==2)
  	 {
  	    
  	    primeNumbers = primeNumbers + i + " ";
  	 }	
        }	
        System.out.println("Prime numbers are :");
        System.out.println(primeNumbers);
     }}