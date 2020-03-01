package FromFirst.String;

public class ImmutableExample {
	public static void main(String[] args) {
		String name_1="Welcome to Java";
		String name_2="Welcome to Java";
		String name_3="Welcome to Java";
		
		System.out.println(name_1==name_2);
		System.out.println(name_2==name_3);
		System.out.println(name_1==name_3);
		
		System.out.println(name_1.equals(name_2));
		System.out.println(name_2.equals(name_3));
		System.out.println(name_1.equals(name_3));
		
	}

}
