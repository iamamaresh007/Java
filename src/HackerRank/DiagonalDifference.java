package HackerRank;

import java.util.Scanner;

public class DiagonalDifference {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int leftDiagonal=sc.nextInt();
	int rytDiagonal=0;
	
	for(int i=1;i<n*n;i++)
	{
		int value = sc.nextInt();
		if(i%(n+1)==0)
		{
			leftDiagonal+=value;
		}
		if(i%(n-1)==0 && i!=(n*n)-1)
		{
			rytDiagonal+=value;
		}
	}
	System.out.println(Math.abs(leftDiagonal-rytDiagonal));

}
}