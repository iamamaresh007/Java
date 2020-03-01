package FromFirst;

import java.util.Scanner;

public class SingleDigitSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		while(num>0 || sum>9)
		{
			if(num==0)
			{
				num=sum;
				sum=0;
			}
		int rem=num%10;
		sum=sum+rem;
		num/=10;
		}
		System.out.println(sum);
	}

}
