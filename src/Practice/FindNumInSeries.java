package Practice;

import java.util.Scanner;

public class FindNumInSeries {
	public static void main(String[] args) {
		int n = 7;
		int sqrt=1,prev=0,res=0;
		for(int i=1;i<=n;i++)
		{
			res=prev+sqrt;
			System.out.println(res+" ");
			prev=sqrt;
			sqrt=(i+1)*(i+1);
		}
		System.out.println("\n"+n+" term is " + res);
	}

}
