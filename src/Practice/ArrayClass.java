package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class ArrayClass {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = new int[5];
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter the element:");
			arr[i]= Integer.parseInt(br.readLine());
		}
		System.out.println("Elements are:");
		display(arr);
		
		Arrays.sort(arr);
		System.out.println("After Sorting:");
		display(arr);
		
		System.out.println("Enter element to be Search:");
		int element =Integer.parseInt(br.readLine());
		int index = Arrays.binarySearch(arr,element);
		if(index<0)
			System.out.println("Element not found");
		else
			System.out.println("Element found at:" + (index+1));
	}

	private static void display(int[] arr) {
		// TODO Auto-generated method stub
		for(int i:arr)
			System.out.println(i);
		
	}


	}


