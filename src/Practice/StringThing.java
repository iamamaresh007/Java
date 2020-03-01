package Practice;

import java.util.Scanner;
import java.util.Stack;

public class StringThing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String Input = sc.next().toLowerCase();
		Stack stack = new Stack();
		
		for(int i=0;i<Input.length();i++)
		{
			stack.push(Input.charAt(i));
		}
		String Reverse="";
		while(!stack.isEmpty())
		{
			Reverse=Reverse+stack.pop();
			
		}
		if(Input.equals(Reverse))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
	}
	}

}
