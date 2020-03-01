package Practice;

public class MissingNumber {
	static int getMissingNum(int arr[],int n)
	{
		int total=(n+1)*(n+2)/2;
		for(int i=0;i<n;i++)
			total-=arr[i];
		return total;
		
	
		
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,6};
		int missing = getMissingNum(arr,arr.length);
		System.out.println(missing);
	}

}
