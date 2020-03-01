package FromFirst;

public class EvenOddSum {
	public static void main(String[] args) {
		int arr[]= {2,1,5,4,7,8,9};
		int evenSum=0;
		int oddSum=0;
		boolean check=false;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				evenSum=evenSum+arr[i];
			}
			else
			{
                 oddSum=oddSum+arr[i];
			}
		}
		
		int Diff=oddSum-evenSum;
		System.out.println(Diff);

	}

}
