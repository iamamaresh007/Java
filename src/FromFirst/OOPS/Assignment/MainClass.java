package FromFirst.OOPS.Assignment;

public class MainClass {
	public static void main(String[] args) {
		Student s1 = new Student(7, "Amaresh");
		Student s2 = new Student(8, "Dhoni");
		Student s3 = new Student(9, "Yash");
		Student s4 = new Student(10, "KL Rahul");

		Student[] arr = { s1, s2, s3, s4 };
		for (Student s : arr) {
			s.display();
			System.out.println("___________________________________");
		}
    System.out.println("No. of Students:"+arr.length);
	}

}
