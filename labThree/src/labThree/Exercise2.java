package labThree;
import java.util.*;
public class Exercise2 {
	public static String getImage(String a) {
		
		StringBuffer sb=new StringBuffer(a);
		sb.reverse();
		String str = sb.toString();
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the word");
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=a;
		
		System.out.println(b+"|"+getImage(a));
		sc.close();
	}

}
