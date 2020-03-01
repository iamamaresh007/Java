package Practice;

import java.util.Scanner;

public class HighestFrequency {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int num = 0;
		int arr[] = new int[30];
		for(int i=0; i < arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=1;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					num=arr[i];
				}
			}
		}
		System.out.println(num);
	}

}
