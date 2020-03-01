package FromFirst.OOPS.six;

class Teacher {
	int id;
	String name;
	String address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}

class Student extends Teacher {
	int marks;

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

}

public class InheritanceExample {
	public static void main(String[] args) {
		Teacher t = new Student();
		t.setId(101);
		t.setName("Manjula");
		t.setAddress("Ilkal");
		System.out.println(t.getId());
		System.out.println(t.getName());
		System.out.println(t.getAddress());
		System.out.println("________________________");
		//Student s = new Student();
		t.setId(1001);
		t.setName("Amaresh");
		t.setAddress("Banglore");
		System.out.println(t.getId());
		System.out.println(t.getName());
		System.out.println(t.getAddress());
		

	}

}
