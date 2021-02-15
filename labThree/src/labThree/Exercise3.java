package labThree;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {
	public static char[] alterString (char[] ch) {
		for (int i = 0; i < ch.length; i++) 
        { 
			if ((ch[i]!='a')&&(ch[i]!='e')&&(ch[i] !='i')&&(ch[i] !=  'o')&&(ch[i]!=  'u')&&(ch[i] != 'A')&&(ch[i] !=  'E')&&(ch[i] !=  'I')&&(ch[i] !=  'O')&&(ch[i]!= 'U'))
        {
		ch[i] = (char) (ch[i] + 1);
		}
			}
		return ch;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a string:");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		System.out.println(alterString(input.toCharArray()));

	}

}
