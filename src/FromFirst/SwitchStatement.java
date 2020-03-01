package FromFirst;

import java.util.Scanner;

public class SwitchStatement {
	public static void main(String[] args) {
		boolean isVowel=false;
		Scanner sc= new Scanner(System.in);
		char alpha=sc.next().charAt(0);
		switch(alpha)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U': isVowel=true;
		}
		if(isVowel==true)
		{
			System.out.println(alpha + " is Vowel");
		}
		else if((alpha>='a' && alpha<='z')||(alpha>='A' && alpha<='Z'))
		{
			System.out.println(alpha + " is Consonent");
		}
		else
		{
			System.out.println(alpha + " is not alphabet");
		}
		
	}

}
