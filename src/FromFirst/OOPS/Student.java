package FromFirst.OOPS;

public class Student {
	int regno;
	String name;
	int section;

	Student(int regno, String name, int section) {
		this.name = name;
		this.regno = regno;
		this.section = section;
	}

	void showInfo() {
		System.out.println(name + " " + regno + " " + section);
	}

	void promoteSection() {
		section++;
	}

}
