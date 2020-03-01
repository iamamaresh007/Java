package Practice;

import java.util.Arrays;

public class SecLargestInArray {
	public static int getSecondLargest(int[] a,int total)
	{
		Arrays.sort(a);
		return a[total-2];
	}
	public static void main(String[] args) {
		int a[]= {5,6,1,9,14,10};
		System.out.println(getSecondLargest(a,6));
	}

}
