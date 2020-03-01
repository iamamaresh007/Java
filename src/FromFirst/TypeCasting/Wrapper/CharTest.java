package FromFirst.TypeCasting.Wrapper;

import java.util.Scanner;

public class CharTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		System.out.println("You entered:" + ch);
		if (Character.isDigit(ch)) {
			System.out.println("Entered character is digit:");
		} else if (Character.isUpperCase(ch)) {
			System.out.println("It is upper case");
		} else if (Character.isLowerCase(ch)) {
			System.out.println("It is lower case");
		} else if (Character.isSpaceChar(ch)) {
			System.out.println("It is space bar");
		} else {
			System.out.println("U Entered foolish");
		}

	}

}
