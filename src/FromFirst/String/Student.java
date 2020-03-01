package FromFirst.String;

import java.util.Scanner;

class Details {
	String firstname;
	String midname;
	String lastname;

	Details(String firstname, String midname, String lastname) {
		this.firstname = firstname;
		this.midname = midname;
		this.lastname = lastname;

	}

	void showProfile() {
		System.out.println(firstname + "-" + midname + "-" + lastname);
	}
}

public class Student {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
		String firstname = sc.next();
		String midname = sc.next();
		String lastname = sc.next();
		Details obj = new Details(firstname, midname, lastname);
		obj.showProfile();
		}

	}

}
