package FromFirst;

import java.util.Scanner;

public class PrimeCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		int count=0;
		while(num!=0)
		{
			int rem=num%10;
			if(isPrime(rem))
			{
				count++;
			}
			num/=10;
		}
		System.out.println(count);
		
	}
	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		} else {
			int sqrt = (int) Math.sqrt(n);
			for (int i = 2; i <= sqrt; i++) {
				if (n % i == 0)
					return false;
			}
			return true;
		}
	}


}
