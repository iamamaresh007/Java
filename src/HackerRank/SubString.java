package HackerRank;

import java.util.Scanner;

public class SubString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(name.substring(a,b));
		
	}

}
