package FromFirst.Array;

public class ArrayEighten {
	public static void main(String[] args) {
		int[] arr= {3,2,4,5,6,4,5,7,3,2,3,4,7,2,0,0,0,0};
		int n=14;
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum+=arr[i];
		}
		System.out.println(sum);
		sum+=arr[n+1];
		System.out.println(sum);
		//int avg;
		System.out.println("Avg is:"+sum/(n+1));
	}

}
