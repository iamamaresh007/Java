package FromFirst.String;

import java.util.Scanner;

public class StringExample3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		StringBuffer sb = new StringBuffer(str);
		System.out.println("Length of the string is:" + sb.length());
		System.out.println("Uppercase:" + sb.toString().toUpperCase());
		
	    String temp= sb.reverse().toString();
		if(str.equals(temp))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not palin");
		}
	}

}
