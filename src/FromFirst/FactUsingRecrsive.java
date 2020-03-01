package FromFirst;

import java.util.Scanner;

class Fact
{
	public static int factorial(int num)
	{
		if(num==0 || num==1)
			return 1;
		else
			return num*factorial(num-1);
	}
}
public class FactUsingRecrsive {
	public static void main(String[] args) 
	{
		Fact f = new Fact();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number:");
		int num=sc.nextInt();
		int fact=f.factorial(num);
		System.out.println(fact);
		sc.close();
	}
	

}
