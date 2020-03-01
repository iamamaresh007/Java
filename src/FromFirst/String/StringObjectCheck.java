package FromFirst.String;

public class StringObjectCheck {

	public static void main(String[] args) {
		
		String name="Amaresh";
		String full_name="Amaresh Patil";
		name=name.concat(" Patil");
		
		System.out.println(name==full_name);
		System.out.println(name.equals(full_name));

	}

}
