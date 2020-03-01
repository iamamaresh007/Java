package FromFirst.String;

import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String temp=str;
		StringBuffer sb= new StringBuffer(str);
		sb.reverse();
		str=sb.toString();
		if(temp.equals(str))
		{
			System.out.println("This palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
		
		
		
	}

}
