package Practice;

import java.util.Scanner;

public class NumberSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long temp,sum=0,rem;
		//temp=n;
		while(n>0)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
			
		}
		System.out.println(sum);
		
		
	}

}
