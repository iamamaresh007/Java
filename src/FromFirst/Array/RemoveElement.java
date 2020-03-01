package FromFirst.Array;

import java.util.Arrays;

public class RemoveElement {

	public static void main(String[] args) {
		int[] arr= {23,6,2,7,9,1};
		System.out.println("Array:"+Arrays.toString(arr));
		int remove_index=0;
		
		for(int i=remove_index;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
		}
		System.out.println("After removing element:"+Arrays.toString(arr));
	
	}

}
