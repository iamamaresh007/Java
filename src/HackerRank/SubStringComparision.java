package HackerRank;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class SubStringComparision {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int k = sc.nextInt();
		
		SortedSet<String> sets = new TreeSet<String>();
		for(int i=0;i<=s.length()-k;i++)
		{
			sets.add(s.substring(i,i+k));
			
		}
		System.out.println(sets.first());
		System.out.println(sets.last());
		
		
	}
	

}
