import java.util.HashSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class HS {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("India");
		hs.add("America");
		hs.add("England");
		hs.add("India");
		
		System.out.println("Hash set=" + hs);
		
		Iterator it = (Iterator) hs.iterator();
		System.out.println("Elements using iterator:");
		while(((java.util.Iterator<String>) it).hasNext())
		{
		  Object s = (Object)it.next();
			System.out.println(s);
		}
		
		
	}

}
