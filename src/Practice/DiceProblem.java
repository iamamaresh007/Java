package Practice;

import java.util.Scanner;

public class DiceProblem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = (int) (Math.ceil(Math.random()*6));
		boolean flag = false;
		for(int i=1;i<=3;i++)
		{
			System.out.println("Enter the gussesed number:");
			int g_num=sc.nextInt();
			if(g_num == num)
			{
				System.out.println("You gussed the crct number in "+ i + " attempts");
				flag=true;
				break;
			}
			
		}
		if(!flag) {
		System.out.println("Srry the number is:" + num);
		}
	}

}
