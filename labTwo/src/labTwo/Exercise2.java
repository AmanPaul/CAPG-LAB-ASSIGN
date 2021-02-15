package labTwo;
import java.util.*;
import java.util.Arrays;

public class Exercise2 {
	public static String[] sortStrings(String arr[]) {
		
		Arrays.sort(arr);
		return arr;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		String arr[]=new String[n];
        for (int i=0;i<arr.length;i++) {
        	arr[i]=sc.next();
        }
        String a[]=sortStrings(arr);
        for(int i=0;i<a.length;i++) {
        	System.out.println(a[i]+" ");
        }
      
	}

}
