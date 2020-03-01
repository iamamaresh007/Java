package FromFirst.OOPS.four;

import java.util.Scanner;

public class Manager {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students:");
		int n = sc.nextInt();
		Student[] students = new Student[n];
		for(int i=0;i<students.length;i++)
		{
			System.out.println("Enter the "+(i+1)+" student details:--");
			System.out.println("Enter the name:");
			String name = sc.next();
			System.out.println("Enter the register number:");
			int reg_num = sc.nextInt();
			
			int scores[] = new int[3];
			for(int j=0; j<scores.length;j++)
			{
				System.out.println("Enter subject "+(j+1)+" score:");
				int score = sc.nextInt();
				scores[j]=score;
			}
			Student obj = new Student(reg_num, name, scores);
			students[i]=obj;
		}
		
		
		for(Student s:students)
		{
			System.out.println("______________________");
			s.displayResults();
			
		}
	}

}
