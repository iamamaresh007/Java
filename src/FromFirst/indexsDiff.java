package FromFirst;

public class indexsDiff {
	public static void main(String[] args) {
		int arr[]= {-7,1,5,2,-4,3,0};
		int sum=0;
		int sum1=0;
		for(int i=0;i<arr.length/2;i++)
		{
			sum=sum+arr[i];
		}
		for(int i=arr.length/2;i<arr.length;i++)
		{
			sum1=sum1+arr[i];
		}
		int diff=sum-sum1;
		System.out.println(diff);
	}

}
