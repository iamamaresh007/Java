package Practice;

import java.util.Scanner;

public class Increase1And9To0 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rem=0,rev=0;
		int num=sc.nextInt();
		while(num>0)
		{
			rem=num%10;
			if(rem==9)
			{
				rem=0;
			}
			else
			{
				rem++;
			}
			rev=rev*10+rem;
			num=num/10;
			
		}
		int temp=0;
		while(rev!=0)
		{
			rem=rev%10;
			temp=temp*10+rem;
			rev=rev/10;
		}
		
		System.out.println("Output:" + temp);
	}

}
