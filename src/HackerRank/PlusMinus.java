package HackerRank;

import java.util.Scanner;

public class PlusMinus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double neg=0,pos=0,zer=0;
		for(int i=0;i<n;i++)
		{
	     int value=sc.nextInt();
	     pos+=value>0 ? 1 :0 ;
	     neg+=value<0 ? 1 : 0;
	     zer+=value == 0 ? 1:0;
			
		}
	System.out.println(pos/n);
	System.out.println(neg/n);
	System.out.println(zer/n);
		
	}

}
