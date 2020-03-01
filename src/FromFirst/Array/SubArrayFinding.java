package FromFirst.Array;

public class SubArrayFinding {
	public static void main(String[] args) {
		int sub_Arr[] = {1,3,5,6};
		int big_Arr[] = {1,2,3,4,5,6};
		boolean is_Subset = isSubset(big_Arr,sub_Arr);
		if(is_Subset==true)
	     {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

	private static boolean isSubset(int[] big_Arr, int[] sub_Arr) {
		int count = 0;
		for(int i=0;i<sub_Arr.length;i++)
		{
			for(int j=0;j<big_Arr.length;j++)
			{
				if(sub_Arr[i]==big_Arr[j])
				{
					count++;
					break;
				}
			}
		}
		return count==sub_Arr.length;
	}

}
