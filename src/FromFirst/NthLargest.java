package FromFirst;

import java.util.Arrays;
import java.util.Scanner;

public class NthLargest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {10,4,5,2,11,99,57};
		int n=sc.nextInt();
		int len=arr.length;
		Arrays.sort(arr);
		System.out.println(arr[len-n]);
	}

}
