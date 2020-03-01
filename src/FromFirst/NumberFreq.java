package FromFirst;

import java.util.Scanner;

public class NumberFreq {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[]= {1,3,5,1,2,5,7,12,5,50};
		int count=0;
		int k = sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==k)
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
