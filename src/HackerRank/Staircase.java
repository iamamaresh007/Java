package HackerRank;

import java.util.Scanner;

public class Staircase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StringBuilder stair = new StringBuilder("");
		
		for(int i=0;i<n;i++)
		{
			stair.append(" ");
		}
		for(int i=1;i<n+1;i++)
		{
			stair.setCharAt(n-i, '#');
			System.out.println(stair);
		}

	}

}
