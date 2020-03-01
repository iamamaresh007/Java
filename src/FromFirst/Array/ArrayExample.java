package FromFirst.Array;

import java.util.Arrays;

public class ArrayExample {
	public static void main(String[] args) {
		int arr[] =getRandomNumbers();
		System.out.println(Arrays.toString(arr));
		printEvenOddCount(arr);
		printDivisibleBy(arr,7);
		printPrimes(arr);
		
	}
	public static void printPrimes(int[] a)
	{
		System.out.print("Prime numbrs are:[");
		for(int i=0;i<a.length;i++)
		{
			if(isPrime(a[i]))
			{
				System.out.print(a[i]+" ");
			}
		}
		System.out.println("]");
	}
	public static boolean isPrime(int num)
	{
		if(num<2)
		{
			return false;
		}
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
				return false;
		}
		
		return true;	
	}
	public static void printDivisibleBy(int[] arr,int ele)
	{
		System.out.print("[");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%ele==0)
			{
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println("]");
	}
	
	public static void printEvenOddCount(int[] arr)
	{
		int ecount=0,ocount=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				ecount++;
			}
			else
			{
				ocount++;
			}
		}
		System.out.println("Even Count:"+ecount);
		System.out.println("Odd Count:"+ocount);
	}
	public static int[] getRandomNumbers()
	{
		int[] arr = new int[20];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.ceil(Math.random()*100));
		}
		return arr;
		
	}

}
