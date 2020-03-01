package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		char[] char1 = a.toCharArray();
		char[] char2 = b.toCharArray();
		a=getSorted(char1);
		b=getSorted(char2);
		System.out.println(a.equals(b)?"Anagram" : "Not Anagram");
	}
	public static String getSorted(char[]ch)
	{
		Arrays.sort(ch);
		return String.valueOf(ch);
	}

}
