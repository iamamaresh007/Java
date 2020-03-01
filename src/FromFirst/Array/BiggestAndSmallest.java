package FromFirst.Array;

public class BiggestAndSmallest {

	public static void main(String[] args) {
		int arr[]= {4,5,2,7,3,15,6,20};
		int small=arr[0];
		int biggest=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(biggest<arr[i])
			{
				biggest=arr[i];
			}
			if(small>arr[i])
			{
				small=arr[i];
			}
		}
		System.out.println(biggest);
		System.out.println(small);
	
	}

}
