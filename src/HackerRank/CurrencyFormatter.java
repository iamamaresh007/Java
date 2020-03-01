package HackerRank;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double d =sc.nextDouble();
		
		Locale India = new Locale("en","IN");
		
		String us = NumberFormat.getCurrencyInstance(Locale.US).format(d);
		String ind = NumberFormat.getCurrencyInstance(India).format(d);
		String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(d);
		String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(d);
		
		System.out.println("US:" + us);
		System.out.println("India:" + ind);
		System.out.println("China:" + china);
		System.out.println("France:" + france);
	}

}
