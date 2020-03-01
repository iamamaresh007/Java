package HackerRank;

import java.util.Scanner;

public class CompareTriplets {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=3;
		int[] a = new int[n];
		int[] b = new int[n];
		int count=0,count1=0;
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]>b[i])
			{
				count++;
			}
			if(b[i]>a[i])
			{
				count1++;
			}
		}
		System.out.println(count + " " + count1);
	}

}
