package Practice;

import java.util.Scanner;

public class PalindromeFind {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long rem,sum=0,temp;
		long num=sc.nextLong();
		temp=num;
		while(num>0)
		{
			rem=num%10;
			sum=sum*10+rem;
			num/=10;
			
		}
		if(temp==sum)
			System.out.println("Its Palindrome " + num);
		else
			System.out.println("Its not palindrome " + num);
		
		
	}

}
