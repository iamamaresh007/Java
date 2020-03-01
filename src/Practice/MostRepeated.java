package Practice;

import java.util.Scanner;

public class MostRepeated {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		char[] a = input.toCharArray();
		
		for(int i=0;i<input.length();i++)
		{
			if(a[i]==a[i-1])
				System.out.println("Most Repeated:" + (i-1));
		}
	}

}
