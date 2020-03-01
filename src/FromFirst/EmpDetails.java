package FromFirst;

import java.util.Scanner;

class Emp
{
	String name;
	int yoj;
	String Addr;
	int salary;
	public Emp(String n,int y,String A,int sal)
	{
		name=n;
		yoj=y;
		Addr=A;
		salary=sal;
	}
	public void printDetails()
	{
		System.out.println(name +"  "+ yoj+ "  " + Addr+"  " + salary);
	}
}


public class EmpDetails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*String name= sc.next();
		int yoj = sc.nextInt();
		String Addr= sc.next();
		int salary=sc.nextInt();*/
		System.out.println("Name  Year Of Joining  Address  Salary");
		
		Emp e = new Emp("amaresh",2020,"Banglore",20000);
		Emp e1 = new Emp("dhoni",2005,"Ranchi",200000000);
		Emp e2 = new Emp("yash",2009,"Bangloree",200000);
		
		e.printDetails();
		e1.printDetails();
		e2.printDetails();
	
	}

}
