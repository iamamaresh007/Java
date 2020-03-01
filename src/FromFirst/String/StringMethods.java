package FromFirst.String;

public class StringMethods {

	public static void main(String[] args) {
		String data = "Amaresh,Dhoni,Yash,Na veen,Ganesh,Ab ,Allu Arjuna,Hri tik,Suresh";
		String[] names = data.split(",");

		/*
		 * for(String name:names) { System.out.println(name); }
		 */
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		// Print names starts with A or D
		System.out.println("------------------------------");
		for (String name : names) {
			if (name.startsWith("A") || name.startsWith("D")) {
				System.out.println(name);
			}
		}
		// Print names ends with sh
		System.out.println("____________________________________");
		for (String name : names) {
			if (name.endsWith("sh")) {
				System.out.println(name);
			}
		}
		// print name with contains es
		System.out.println("---------------------------------------------");
		for (String name : names) {
			if (name.contains("es")) {
				System.out.println(name);
			}
		}
		// Print all the names which is having < 5 characters
		System.out.println("_______________________________________________");
		for (String name : names) {
			if (name.length() <= 5) {
				System.out.println(name);
			}
		}
		// Print first 3 letters with uppercase
		System.out.println("*************************************************");
		for (String name : names) {
			name = name.replace(" ", "");
			if (name.length() >= 3) {
				String subName = name.substring(0, 3).toUpperCase();
				System.out.println(subName);
			}
		}
		System.out.println("///////////////////////////////////////////////////");
		String nam = " Krishna ";
		System.out.println(nam.trim().length());

		System.out.println("....................................");
		String n = "Kri sh na";

		System.out.println(n.substring(0, 4).toUpperCase());
		System.out.println(n.substring(0, 4).toUpperCase().substring(3));
		System.out.println(n.substring(0, 4).toUpperCase().substring(3).trim());
		System.out.println(n.substring(0, 4).toUpperCase().substring(3).trim().length());

		// Display the names which are palindrome
		System.out.println("^^^^^^^^^^^^^^^Palindrome Strings^^^^^^^^^^^^^^^^^^^^^");
		String s_names = "liril,amma,apa,12321,amaresh";
		// String[] splited_names=s_names.split(",");
		for (String ele : s_names.split(",")) {
			if (isPalindrome(ele)) {
				System.out.println(ele);

			}
		}
		System.out.println("############################################");
		// Print Company names only
		String emailData = "lakshman.a@heraizen.com,krish.t@wipro.co.in,nareen.b@ibm.in,balu.m@tesco.com";
		String[] emails = emailData.split(",");
		for (String email : emails) {
			String d[] = email.split("@");
			String bname = d[1];
			int index = bname.indexOf(".");
			String cname = bname.substring(0, index);
			cname = cname.substring(0, 1).toUpperCase().concat(cname.substring(1));
			// cname=cname.toUpperCase();
			System.out.println(cname);
		}
	}

	public static boolean isPalindrome(String str) {
		int n = str.length();
		for (int i = 0, j = n - 1; i <= n / 2; i++, j--) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
		}
		return true;

	}

}
