package FromFirst.String;

import java.util.Scanner;

public class DuplicateChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] arr = str.toCharArray();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i+1; j < str.length(); j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i]);
					count++;
				}
			}

		}
		System.out.println(count);

	}

}
