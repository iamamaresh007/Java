package HackerRank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String,String> name2phn = new HashMap<String,String>();
		
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			String name = sc.next();
			String phn = sc.next();
			name2phn.put(name,phn);
		}
		System.out.println(name2phn);
		
		while(sc.hasNext())
		{
			String name = sc.next();
			if(name2phn.containsKey(name))
			{
				System.out.println(name + "=" + name2phn.get(name));
			}
			else
			{
				System.out.println("Not found");
			}
		}
		
	}

}
