package FromFirst;

import java.util.Scanner;

public class NumberCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int count=0;
		int sum=0;
		while(num!=0)
		{
			sum=sum+num%10;
			num=num/10;
			count++;
			
		}
		System.out.println(count);
		System.out.println(sum);
	}

}
