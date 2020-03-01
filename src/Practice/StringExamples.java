package Practice;

public class StringExamples {
	public static void main(String[] args) {
		/*char ch = 'a';
		String str = Character.toString(ch); //Character to string
		System.out.println("String:" + str);
		*/
		
		String str = "Amaresh";
		for(int i=0;i<str.length();i++)  //String to Character
		{
			char ch = str.charAt(i);
			System.out.println(ch);
		}
	}

}
