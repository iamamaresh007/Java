package Practice;

import java.util.*;

public class GradingProblem {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int grade[] = new int[5];
		System.out.println("Enter values betn 2-5");
		for (int i = 0; i < 5; i++) {
			grade[i] = in.nextInt();
		}
		boolean val = check1(grade);
		if (val) {
			boolean val2 = check2(grade);
			if (val2) {
				boolean val3 = check3(grade);
				if (val3) {
					System.out.println("Schoolrship");
				} else {
					System.out.println("No schoolrship:");
				}
			} else {
				System.out.println("No schoolrship:");
			}
		} else {
			System.out.println("No schoolrship:");
		}

	}

	private static boolean check3(int[] grade) {
		int avg = 0, tavg;
		int total = grade.length;
		for (int i = 0; i < grade.length; i++) {
			avg = avg + grade[i];
		}
		tavg = (int) ((float) avg / total);
		if (tavg >= 4.0)
			return true;
		else {
			return false;
		}
	}

	private static boolean check2(int[] grade) {
		for (int i = 0; i < grade.length; i++) {
			if (grade[i] == 5) {
				return true;
			}
		}

		return false;

	}

	private static boolean check1(int[] grade) {
		for(int i=0;i<grade.length;i++) {
			if(grade[i]==2) {
		return false;
	}
}
		return true;
	}
}
