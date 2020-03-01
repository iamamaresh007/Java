package FromFirst.Array;

import java.util.Scanner;

public class SearchElement {
	public static void main(String[] args) {
		int arr[]= {4,1,5,2,8,7,1,9,3,1};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter element to search:");
		int element=sc.nextInt();
		int index=searchElement(arr,element);
		if(index!=-1)
		{
			System.out.println("Element found at " +(index+1));
			int occurance=mostOccurance(arr,element);
			System.out.println(element +" occuring " +occurance+" times");
		}
		else
		{
			System.out.println("Elemnt not found");
		}
	
	}
	public static int searchElement(int[] arr,int ele)
	{
		int index=-1;
		for(int i=0;i<arr.length;i++)
		{
			if(ele==arr[i])
			{
				index=i;
				break;
			}
		}
		return index;
	}
	public static int mostOccurance(int[] arr,int ele)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==ele)
				count++;
		}
		return count;
	}
	

}
