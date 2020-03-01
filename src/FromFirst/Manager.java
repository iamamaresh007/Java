package FromFirst;

import java.util.Scanner;

public class Manager {
	public static void main(String[] args) {
		MathOperations mo = new MathOperations();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1:");
		int a=sc.nextInt();
		System.out.println("Enter num2:");
		int b=sc.nextInt();
		System.out.println("Enter num3:");
		int c=sc.nextInt();
		int big=mo.Biggest(a, b, c);
		System.out.println();
		sc.close();
	}

}
