package FromFirst.String;

import java.util.Scanner;

public class CountVowelsAndConso {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String alphabet = sc.next();
		char[] ch = new char[alphabet.length()];
		for(int i=0;i<alphabet.length();i++)
		{
			ch[i]=alphabet.charAt(i);
		}
		int v_count=0;
		int c_count=0;
		for(char c:ch)
		{
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
			{
			    v_count++;
			}
			else
			{
				c_count++;
			}
		}
		System.out.println(v_count);
		System.out.println(c_count);
		
	}

}
