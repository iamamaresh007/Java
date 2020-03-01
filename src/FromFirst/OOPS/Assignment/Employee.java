package FromFirst.OOPS.Assignment;

public class Employee {
	int id;
	String name;
	float sal=20000f;

	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	Employee(int id, String name, float sal) {
		this.id = id;
		this.name = name;
        
	}

	void display() {
		System.out.println("id is:" + id + ",name:" + name + ",salary:" + sal);


	}

}
