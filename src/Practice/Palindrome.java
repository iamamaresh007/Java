package Practice;

import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String InputString = sc.next().toLowerCase();
		Stack stack = new Stack();
		
		for(int i=0;i<InputString.length();i++)
		{
			stack.push(InputString.charAt(i));
		}
		String RevrseString="";
		while(!stack.isEmpty())
		{
			RevrseString=RevrseString+stack.pop();
		}
		if(InputString.equals(RevrseString))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}

}
