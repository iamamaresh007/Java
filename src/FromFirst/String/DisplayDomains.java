package FromFirst.String;

public class DisplayDomains {

	public static void main(String[] args) {
		String str = "rajesh.t@ibm.co.in,mahesh.m@tesco.com,john.t@bankfee.com,pavan.t@ukdocs.uk,manoj.pvn@ibm.in";
		String[] arr = str.split(",");
		for (String s : arr) {
			String[] s1 = s.split("@"); // It is to print company names
			String name = s1[1];
			int index = name.indexOf(".");
			String c_name = name.substring(0, index);
			c_name = c_name.toUpperCase();
			System.out.println(c_name);

			String[] s2 = s.split("@");
			String name1 = s2[0];
			int index1 = name1.indexOf(".");
			String emp_name = name1.substring(0, index1);
			emp_name = emp_name.substring(0, 1).toUpperCase().concat(emp_name.substring(1));
			System.out.println(emp_name);
			System.out.println("______________________________");
		}

	}

}
