package Practice;

import java.util.Scanner;

public class IdentifyChar {
	public static void main(String[] args) {
		String ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character:");
	    ch = sc.next().toLowerCase();
		if(ch.equals("a")|| ch.equals("e") ||ch.equals("i")||ch.equals("o") || ch.equals("u"))
			System.out.println("Vowel");
		else
			System.out.println("Consonent");
	
	}

}
