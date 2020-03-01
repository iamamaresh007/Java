package FromFirst.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 125, 23, 364, 45, 89, 67, 28 };
		biggest(arr);
		System.out.println("---------------------");
		System.out.println("Enter the key:");
		int key = sc.nextInt();
		int pos = indexOf(arr, key);
		System.out.println("Key value is at " + (pos + 1));
		//sort(arr);
	}

	/*private static void sort(int[] arr) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the order:");
		String order = sc.next();
		if(order.equalsIgnoreCase("ASC"))
		{
			Arrays.sort(arr);
			//System.out.println(arr);
		}
		else if(order.equalsIgnoreCase("DSC"))
		{
			Arrays.sort(arr);
			System.out.println(arr.toString());
			
		}
		
	}*/

	private static void biggest(int[] arr) {
		int biggest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > biggest) {
				biggest = arr[i];
			}
		}
		System.out.println(biggest);
	}

	private static int indexOf(int arr[], int key) {
		int pos = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				pos = i;
			}
		}
		return pos;

	}

}
