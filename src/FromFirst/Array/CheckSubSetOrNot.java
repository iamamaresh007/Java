package FromFirst.Array;

public class CheckSubSetOrNot {
	public static void main(String[] args) {
		int[] big= {1,6,7,2,4,6,8,3,9};
		int[] small= {1,2,3};
		System.out.println(isSubSet(big,small));
		
	}
	public static boolean isSubSet(int[] big,int[] small)
	{
		for(int i=0;i<small.length;i++)
		{
			if(!search(big,small[i])) {
				return false;
			}
		}
		return true;
	}
	public static boolean search(int[] a,int ele)
	{
		boolean isFound=false;
		for(int i=0;i<a.length;i++)
		{
			if(ele==a[i])
			{
				isFound=true;
			}
		}
		return isFound;
	}

}
