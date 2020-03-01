package FromFirst;

import java.util.Scanner;

public class OperationsUsingSwitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("1:add 2:sub 3:Multi 4:Div 5:Mod");
		int operator=sc.nextInt();
		switch(operator)
		{
		case 1:
			 int sum=num1+num2;
			 System.out.println(sum);
			 break;
		case 2:
			 int Sub=num1-num2;
			 System.out.println(Sub);
			 break;
		case 3:
			 int Multi=num1*num2;
			 System.out.println(Multi);
			 break;
		case 4:
			 int Div=num1/num2;
			 System.out.println(Div);
			 break;
		case 5:
			 int Mod=num1%num2;
			 System.out.println(Mod);
			 break;
		default:
				 System.out.println("You entered invalid operator");
				 break;
		}
		
		
	}

}
