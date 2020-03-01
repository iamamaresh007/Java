package Practice;

import java.util.*;

public class FindingFrequency {
	static HashSet<Character> set = new HashSet<>();
	static HashMap<Character, Integer> map = new HashMap<>();
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the String :");
		
		String word = in.next().toLowerCase();
		
		Character arr[] = new Character[word.length()];
		for (int i = 0; i < word.length(); i++) {
			char single = word.charAt(i);
			set.add(single);
			arr[i] = single;
		}
		
		System.out.println(set);
		System.out.println(Arrays.toString(arr));

		Iterator<Character> it = set.iterator();
		while (it.hasNext()) {
			int c = 0;
			Character s = it.next();
			for (int i = 0; i < arr.length; i++) {
				if (s.equals(arr[i])) {
					c++;
				}
			}
			map.put(s, c);
		}
		//int max = Collections.max(map.values());
		//System.out.println(max);
		Character maxEntry = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();      
		System.out.println("Maximum Occurence = " + maxEntry);
		
	}
 
}
