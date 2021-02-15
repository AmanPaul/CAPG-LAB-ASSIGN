package labOne;
import java.util.*;
public class SumOfCubes {
	public static int Cubes (int x) {
		int number = x;
		int sum = 0;
		while (number > 0) {
		    int digit = number % 10;
		    sum += digit * digit * digit;
		    number /= 10;
		}
		return sum;		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		sc.close();
		System.out.println(Cubes(x));

	}

}
