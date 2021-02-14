package labThree;
import java.util.*; 
public class Exercise4 {
	public static int modifyNumber(int number1) {
		StringBuffer sb = new StringBuffer(number1);
	    String str = sb.toString();
	    String cc="";
		int z=str.length();
		int d=0;
		int a[]=new int[z];
	    for(int i=1;i<=z;i++) {
	    	for(int j=i-1;j<i;j++) {
	    		
	    		int b=a[j]-a[i];
	    		int q[]=new int[j];
	    		q[d]=b;
	    		
	    		b=0;
	    	}
	    	d++;
	     }
	    String g=cc.trim();
	    int k=Integer.parseInt(g);
	    return k;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number1=sc.nextInt();
		System.out.println(modifyNumber(number1));
	}

}
