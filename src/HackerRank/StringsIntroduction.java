package HackerRank;

import java.util.Scanner;

public class StringsIntroduction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name1 = sc.next();
		String name2= sc.next();
		
		String s1 = name1.substring(0,1).toUpperCase();
		String CapName1 = s1 + name1.substring(1);
		
		String s2 = name2.substring(0,1).toUpperCase();
		String CapName2 = s2 + name2.substring(1);
		
		
		int len  = name1.length()+name2.length();
		System.out.println(len);
		
		if(name1.length()>name2.length())
			System.out.println("Yes");
		else
			System.out.println("No");
		
		System.out.println(CapName1 +" " + CapName2);
		//System.out.println(CapName2);
		
		
	}

}
