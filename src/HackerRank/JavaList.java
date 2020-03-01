package HackerRank;

import java.util.LinkedList;
import java.util.Scanner;

public class JavaList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		for(int i=0;i<n;i++)
		{
			int value=sc.nextInt();
			ll.add(value);
		}
		
		int Q = sc.nextInt();
		for(int i=0 ; i<Q ;i++)
		{
			String action = sc.next();
			if(action.equals("Insert"))
			{
				int index = sc.nextInt();
				int value = sc.nextInt();
				ll.add(index,value);
			}
			else
			{
				int index = sc.nextInt();
				ll.remove(index);
			}
		}
		
		for(Integer num:ll)
		{
			System.out.println(num + " ");
		}
	
		
		
	}

}
