package Practice;

public class MaxAndMin {
	public static void main(String[] args) {
		int arr[]= {10,11,120,2,12,88};
		int max = getMax(arr);
		System.out.println("Max Value:" + max);
		
		int min = getMin(arr);
		System.out.println("Min value:" + min);
		
	}
	
	public static int getMax(int[] inputArray)
	{
		int maxValue = 0;
		for(int i=0;i<inputArray.length;i++)
		{
			if(inputArray[i]>maxValue)
			{
				maxValue=inputArray[i];
			}	
		}
		return maxValue;
	}
	public static int getMin(int[] inputArray)
	{
		int minValue = inputArray[0];
		for(int i=0;i<inputArray.length;i++)
		{
			if(inputArray[i]<minValue)
			{
				minValue=inputArray[i];
			}	
		}
		return minValue;
	}
}
