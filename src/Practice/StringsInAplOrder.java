package Practice;

import java.io.IOException;
import java.util.Scanner;

public class StringsInAplOrder {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int count;
		String temp;
		System.out.println("Enter the count of Strings you would like to enter:");
		count = sc.nextInt();
		String str[] = new String[count];
		System.out.println("Enter the Strings:");
		for(int i=0 ; i<count ; i++)
		{
			str[i] = sc.next();
		}
		
		for(int i=0 ; i < count; i++)
		{
			for(int j=i+1; j<count; j++)
			{
				if(str[i].compareTo(str[j])>0)
				{
					temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
		System.out.println("Sorted Order is:");
		for(int i=0;i <=count;i++)
		{
			System.out.println(str[i] + ",");
		}
		
		
		
	}

}
