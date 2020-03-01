package FromFirst.Array;

import java.util.Scanner;

public class SearchBetnOneToFifty {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers betn 1 to 50:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		boolean isFound1 = false;
		boolean isFound2 = false;
		int[] array = { 7, 16, 25, 36, 48 };
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num1) {
				isFound1 = true;
			}
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num2) {
				isFound2 = true;
			}
		}
		if (isFound1 && isFound2) {
			System.out.println("Success");
		} else {
			System.out.println("Failed");
		}
		sc.close();
	}

}
