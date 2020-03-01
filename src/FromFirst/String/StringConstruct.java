package FromFirst.String;

public class StringConstruct {

	public static void main(String[] args) {
		String name_1="Krishna";
		String name_2 = new String("Krishna");
		String name_3 = new String("Krishna");
		
		System.out.println(name_1==name_2);
		System.out.println(name_2==name_3);
		System.out.println(name_1==name_3);

		System.out.println(name_1.equals(name_2));
		System.out.println(name_2.equals(name_3));
		System.out.println(name_1.equals(name_3));

	}

}
