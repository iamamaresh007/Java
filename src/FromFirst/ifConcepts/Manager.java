package FromFirst.ifConcepts;

import java.util.Scanner;

public class Manager {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the country name:");
		String country_name = sc.next();
		Country country = CurrencyContainer.getCountry(country_name);
		System.out.println(country.getCurrency());
		
	}

}
