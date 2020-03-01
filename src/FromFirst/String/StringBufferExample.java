package FromFirst.String;

import java.util.Scanner;

public class StringBufferExample {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number of persons:");
		int num_persons=sc.nextInt();
		for(int i=0;i<num_persons;i++)
		{
		System.out.println("Enter surname:");
		String sur=sc.next();
		System.out.println("Enter midname:");
		String mid=sc.next();
		System.out.println("Enter lastname:");
		String last=sc.next();
		
		sb.append(sur);
		sb.append(last);
		
		System.out.println("Name: " + sb);
		
		//Add mid into the name
		int n=sur.length();
		sb.insert(n, mid);
		System.out.println("Full name is: "+sb);
		System.out.println("In reverse:" + sb.reverse());
		
		sb=new StringBuffer();
		}
		
	}

}
