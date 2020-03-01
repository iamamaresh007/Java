package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) throws IOException
	{
		HashMap<String,Long> hm =new HashMap<>();
		String name,str;
		Long phno = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			System.out.println("1.Enter phone entities:");
			System.out.println("2.Lookup in the book:");
			System.out.println("3.Display names in the book:");
			System.out.println("4.Exit");
		
		System.out.println("Enter ur choice:");
        int n = Integer.parseInt(br.readLine());
        
        switch(n)
        {
        case 1:System.out.println("Enter name:");
               name = br.readLine();
               System.out.println("Enter phno:");
               str = br.readLine();
               phno = new Long(str);
               hm.put(name,(long) phno);
               break;
        case 2:System.out.println("Enter name:");
               name=br.readLine();
               name=name.trim();
               hm.get(name);
               System.out.println("Phno:"+ phno);
               break;
        case 3:
        	  Set <String> set = new HashSet<String>();
        	  set = hm.keySet();
        	  System.out.println(set);
        	  break;
        case 4:break; 	  
        	  
        }
	}

}
}
