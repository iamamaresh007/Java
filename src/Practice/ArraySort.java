package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int n,k;
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		int k = sc.nextInt();
		System.out.println("Enter the elememts:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
	 Arrays.sort(arr);
	 for(int i=0; i<arr.length;i++)
	{
		 System.out.println(arr[i]);
	 }
	
	 System.out.println("kth value is:" + arr[k-1]);
		
	}

}
