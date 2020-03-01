package FromFirst.OOPS.three;

import java.util.Scanner;

public class EmployeeManager {

	public static void main(String[] args) {
		String data = "1001,Lakshman,45000,MCA,12-1002,Rajesh,55500,B.Tech,10-1003,Mahesh,87788,B.Tech,12"
				+ "-1004,Pradeep,87658,B.Tech,20-1005,Charan,35000,M.Tech,3-1006,Laxmi,87788,B.Tech,12"
				+ "-1007,Indu Shree,87658,B.Tech,20-1008,Charan Raj,35000,M.Tech,3";
		String[] dataArr = data.split("-");
		// Scanner sc = new Scanner(System.in);
		Employee[] employees = new Employee[dataArr.length];
		System.out.println("Employees list is:");
		int i = 0;
		for (String s : dataArr) {
			String arr[] = s.split(",");
			int empno = Integer.parseInt(arr[0]);
			String name = arr[1];
			int salary = Integer.parseInt(arr[2]);
			String qualification = arr[3];
			int yearOfExp = Integer.parseInt(arr[4]);
			Employee emp = new Employee(empno, name, salary, qualification, yearOfExp);
			employees[i++] = emp;
			emp.showInfo();
		}

		showMaximumSalaryEmployeeDetails(employees);
		showEmployeesByYearOfExp(employees, 10);
		showNamesStartsWithC(employees);
		showNamesStartsWithR(employees);
		empQualification(employees);
	}

	private static void showNamesStartsWithC(Employee[] employees) {
		System.out.println("\nThese are the names starts with C");
		for (Employee e : employees) {
			if (e.getName().contains("C")) {
				e.showInfo();
			}
		}

	}
	private static void showNamesStartsWithR(Employee[] employees) {
		System.out.println("\nThese are the names starts with R");
		for (Employee e : employees) {
	
			if (e.getName().startsWith("R")) {
				e.showInfo();
			}
		}

	}
	private static void empQualification(Employee[] employees)
	{
		System.out.println("\nThese are the persons who did B.Tech");
		int count=0;
		for(Employee e:employees)
		{
			if(e.getQualification().contains("B.Tech"))
			{
				count++;
				e.showInfo();
			}
		}
		System.out.println(count+" employees completed B.tech");
	}

	private static void showMaximumSalaryEmployeeDetails(Employee[] employees) {

		float maxSalary = maxSalary(employees);
		System.out.println("\nMax salary is:" + maxSalary);
		for (Employee e : employees) {
			if (e.getSalary() == maxSalary) {
				e.showInfo();
			}
		}

	}

	private static void showEmployeesByYearOfExp(Employee[] employees, int Exp) {
		System.out.println("\nEmployee list having greater than 10 yrs experiance:");
		for (Employee e : employees) {
			if (e.getYearOfExp() >= Exp) {
				e.showInfo();
			}
		}
	}

	private static float maxSalary(Employee[] employees) {
		float maxSalary = employees[0].getSalary();
		for (Employee e : employees) {
			if (maxSalary < e.getSalary()) {
				maxSalary = e.getSalary();
			}
		}
		return maxSalary;
	}

}
