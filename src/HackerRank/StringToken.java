package HackerRank;

import java.util.Scanner;

public class StringToken {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		s=s.trim();
		 if(s.length()==0)
		 {
			 System.out.println(0);
		 }
		 
		 String[] words = s.split("[^a-zA-Z]+");
		 
		 System.out.println(words.length);
		 
		 for(String word:words)
		 {
			 System.out.println(word);
		 }
	}

}
