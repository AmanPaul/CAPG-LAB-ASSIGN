package labTwo;
import java.util.Arrays;
import java.util.Scanner;
public class Exercise4 {
	public static int modifyArray(int arr[], int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				arr[j++] = arr[i];
			}
		}
		arr[j++] = arr[n - 1];
		return j;
}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter all the elements:");
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			
		}
		sc.close();
		
		Arrays.sort(arr);
		int length = arr.length;

		int m = modifyArray(arr, length);

		// printing array elements

		for (int i = m - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
}
