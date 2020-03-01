package FromFirst;

import java.util.Scanner;

class Prime {
	public static boolean IsPrime(int num) {
		if(num<=1)
			return false;
		else {
		for (int i = 2; i <=num/2; i++) {
			if (num % i == 0) {
				return false;
			}
			
		}
		return true;
		}
		
		}
}

public class PrimeCountInNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int count=0;
		while (number != 0) {
			int rem = number % 10;
			//if(IsPrime(rem))
			{
				count++;
			}
			number /= 10;

		}
		System.out.println(count);

	}

}
