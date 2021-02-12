package labTwo;
import java.util.*;
public class SecondSmallest {
	public static int getSecondSmallest(int arr[]) {
		int n = arr.length;
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
		Arrays.sort(arr);
		return arr[1];

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
		System.out.println(getSecondSmallest(arr));
		sc.close();
	}

}
