package HackerRank;

import java.util.Scanner;

public class BigSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long sum=0;
		long[] arr = new long[n];
		for(int i=0;i<n;i++)
		{
		arr[i]= sc.nextLong();
		sum=sum+arr[i];
		}
		System.out.println(sum);
		
		
	}

}
