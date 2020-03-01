package Practice;

import java.util.HashMap;
import java.util.Set;

public class FindDuplicateCharsInString {
	public void CountDup(String str)
	{
		HashMap<Character,Integer> map = new HashMap<>();
	    char[] chars = str.toCharArray();
	    for(Character ch:chars)
	    {
	    	if(map.containsKey(ch))
	    	{
	    		map.put(ch, map.get(ch)+1);
	    	}
	    	else
	    	{
	    		map.put(ch,1);
	    	}
	    }
	    Set<Character> keys = map.keySet(); //Obtaining Set of Keys
	    	for(Character ch :keys)
	    	{
	    		if(map.get(ch)>1)
	    		{
	    			System.out.println("Char " + ch +" " + map.get(ch));
	    		}
	    	}
	    
		
	}
	public static void main(String[] args) {
		FindDuplicateCharsInString obj = new FindDuplicateCharsInString();
		System.out.println("String:Amaresh.Basanagouda.patil");
		System.out.println("-----------------");
		obj.CountDup("amaresh.basanagouda.patil");
	}

}
