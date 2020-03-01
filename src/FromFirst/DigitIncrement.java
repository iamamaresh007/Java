package FromFirst;

import java.util.Scanner;

public class DigitIncrement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		sc.close();
		System.out.println(revNum(num));
	    
	}

	private static int revNum(int num) {
		int rev=0;
		while(num>0)
		{
			int dig=num%10;
			if(dig==9)
			{
				dig=0;
			}
			else
			{
				dig+=1;
			}
			rev=rev*10+dig;
			num=num/10;
		}
		return (numRev(rev));
	}

	private static int numRev(int num) {
		int rev=0;
		while(num>0)
		{
			int dig=num%10;
			rev=rev*10+dig;
			num/=10;
		}
		
		return rev;
	}

}
