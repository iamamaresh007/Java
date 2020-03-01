package Practice;

import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[] args) {
		float p,t,r,si;
		SimpleInterest obj = new SimpleInterest();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the principle");
		p = sc.nextFloat();
		System.out.println("Enter the time");
		t =sc.nextFloat();
		System.out.println("Enter the rate:");
		r = sc.nextFloat();
		si = (p*t*r)/100;
		System.out.println("Simple Interest is--" + si);
			
	}
	

}
