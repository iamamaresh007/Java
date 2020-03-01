package FromFirst.String;

public class ConvertStringToCharacter {
	public static void main(String[] args) {
		String name="Amaresh";
		//Creating array of string length
		/*char[] ch=new char[name.length()];
		
		for(int i=0;i<name.length();i++)
		{
			ch[i]=name.charAt(i);
		}*/
		char[] ch=name.toCharArray();
		
		for(char c:ch)
		{
			System.out.println(c);
		}
		
	} 

}
