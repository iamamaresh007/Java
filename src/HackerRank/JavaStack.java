package HackerRank;

import java.util.HashSet;
import java.util.Scanner;

public class JavaStack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String[] left=new String[t];
		String[] right = new String[t];
		
		for(int i=0;i<t;i++)
		{
			left[i]=sc.next();
			right[i]=sc.next();
			
		}
		
		HashSet<String> hs = new HashSet<String>();
		
		for(int i=0;i<t;i++)
		{
			hs.add(left[i]+ " "+ right[i]);
			System.out.println(hs.size());
		}
		
	}

}
