package FromFirst.Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MissingNumber {
	public static void main(String[] args) {
		int[] arr = {1,2,5,6,4,7,9,8,10};
		Arrays.sort(arr);
		Arrays.toString(arr);
	
		int n=arr.length;
		int total=(n+1)*(n+2)/2;
		
		for(int i=0;i<arr.length;i++)
		{
			total-=arr[i];
		}
		System.out.println(total);
		
		
		
	}

}
