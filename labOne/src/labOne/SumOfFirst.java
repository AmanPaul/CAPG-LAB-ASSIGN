package labOne;
import java.util.*;
public class SumOfFirst {
	public int calculateSum(int n) {
		int sum=0;
		int i=0;
		for(i=0;i<=n;i++) {
			if(i%3==0 || i%5 ==0) {
				sum+=i;
			}
			
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfFirst sf=new SumOfFirst();
		System.out.println("Enter the n natural number :");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		System.out.println(sf.calculateSum(n));

	}

}
