package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class SecLargestMark {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter array size:");
	int n = sc.nextInt();
	//int[] arr;
	
	System.out.println("enter array:");
	int arr = sc.nextInt();
	System.out.println (getSecLargest(null, arr));
	}
	
	

public static int getSecLargest(int[] arr,int n)
{
	Arrays.sort(arr);
	return arr[n-2];
	
}
}