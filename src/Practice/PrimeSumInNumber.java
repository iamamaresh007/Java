package Practice;

import java.util.Scanner;

public class PrimeSumInNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rem,count=0,tot=0;
		int num=sc.nextInt();
		while(num>0)
		{
			rem=num%10;
			for(int i=1;i<=rem;i++)
			{
				if(rem%i==0)
					count++;
			}
			if(count==2) 
			{
				tot=tot+rem;
			}
			num=num/10;
			count=0;
		}
		
	   System.out.println(tot);
	}

}
