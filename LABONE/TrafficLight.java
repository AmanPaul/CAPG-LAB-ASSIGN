package labOne;
import java.util.*;

public class TrafficLight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the light number\n 1.Red\n 2.Yellow\n 3.Green");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n==1) {
			System.out.println("Stop!");
		}
		else if(n==2) {
			System.out.println("Ready!");
		}
		else {
			System.out.println("Go!");
		}
		
	}

}
