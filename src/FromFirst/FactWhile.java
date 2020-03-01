package FromFirst;

import java.util.Scanner;

public class FactWhile{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int fact=1,i = 1;
		while (i<=num) {
			fact = fact * i;
			i++;

		}
		System.out.println(fact);

	}
}
