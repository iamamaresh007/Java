package Practice;

import java.util.Scanner;

public class NumberSumCond {
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		int N = 234;
		int times=N%10;
		N/=10;
		int temp=N/10,sum=0;
		while(times>0)
		{
			int rem=N%10;
			sum=temp+rem;
			temp=sum;
			times--;
		}
		System.out.println(temp);
	
	}

}
