package FromFirst.OOPS.Assignment;

public class Student {
	int id;
	String name;
	String address = "Ilkal";

	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	void display() {
		System.out.println("name:" + name + ",id:" + id + ",address:" + address);

	}

}
