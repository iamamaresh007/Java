package FromFirst.OOPS;

public class Manager {
	public static void main(String[] args) {
		Student s1 = new Student(7, "Amaresh", 1);
		Student s2 = new Student(18, "dhoni", 2);
		Student s3 = new Student(8, "Yash", 5);
		Student s4 = new Student(1, "allu arjun", 1);
		Student s5 = new Student(2, "ganesh", 2);

		Student[] arr = { s1, s2, s3, s4, s5 };
		for (Student s : arr) {
			s.showInfo();

		}
		System.out.println("************");
		for (Student s : arr) {
			if (s.name.toLowerCase().startsWith("a")&& s.section == 1) {
				s.showInfo();

			}
		}
		System.out.println("_______________");
		for (Student s : arr) {
			if (s.name.startsWith("a") || s.name.startsWith("d")) {
				s.showInfo();

			}
		}
		System.out.println("^^^^^^^^^^^^^^^^^^^^");

	}

}
