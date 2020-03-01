package Practice;

import java.util.HashMap;
import java.util.Scanner;

public class Example {
	static HashMap<Character, Integer> map1 = new HashMap<>();
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the original string :");
		String original = in.next().toLowerCase();
		int c = 0;
		int len = original.length();
		for (int i = 0; i < len; i++) {
			char s = original.charAt(i);
			if (map1.get(s) == null) {
				map1.put(s, 1);
			}
			else {
				c = map1.get(s);
				map1.put(s, c + 1);
			}
		}
		System.out.println(map1);
	}
}
