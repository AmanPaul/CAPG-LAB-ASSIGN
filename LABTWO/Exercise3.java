package labTwo;
import java.util.Arrays;
import java.util.Scanner;
public class Exercise3 {

	
		public static int[] getSorted(int arr[], int n) {
			Arrays.sort(arr);
			for (int i = 0; i < arr.length / 2; i++) {
				int temp = arr[i];
				arr[i] = arr[arr.length - i - 1];
				arr[arr.length - i - 1] = temp;
			}

			return (arr);
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
			getSorted(arr, arr.length);
			for (int i = 0; i< arr.length; i++) {
				System.out.print(arr[i] + " ");
			}

		}

	}