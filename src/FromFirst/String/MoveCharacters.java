package FromFirst.String;

public class MoveCharacters {
	private static String moveChars(String string)
	{
		StringBuilder lowercase = new StringBuilder();
		StringBuilder uppercase = new StringBuilder();
		
		for(int i=0;i<string.length();i++)
		{
			char ch = string.charAt(i);
			if(ch >= 'A' && ch<='Z')
			{
				uppercase.append(ch);
			}
			else
			{
				lowercase.append(ch);
			}
		}
		return lowercase.toString() +uppercase;
		
	}
	public static void main(String[] args) {
		String str = "Love You 3000 Times";
		System.out.println("Before operation:" + str);
		System.out.println("After operation:" + moveChars(str));
	}

}
