package FromFirst.String;

public class GetCharsExample {
	public static void main(String[] args) {

		String s = "I am amaresh and i am from Ilkal";
		char[] arr = new char[20];

		s.getChars(0, 13, arr,0);
		System.out.println(arr);

	}
}