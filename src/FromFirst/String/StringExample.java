package FromFirst.String;

public class StringExample {
	public static void main(String[] args) {
		String name="Amaresh";
		for(int i=0;i<name.length();i++)
		{
			System.out.println(name.charAt(i));
		}
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name);
		
		name=name.toUpperCase();
		System.out.println(name);
	}

}
