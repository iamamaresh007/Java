package FromFirst.OOPS.four;

public class Student {
	private int regno;
	private String name;
	private int subject_Scores[];
	private int total_score;
	private String result;
	private String grade;

	Student(int regno, String name, int[] subject_Scores) {
		this.regno = regno;
		this.name = name;
		this.subject_Scores = subject_Scores;
	}

	public void displayResults() {
		total_score=getTotal();
		result = getResult();
		grade = getGrade();
		System.out.println("Reg.number:" + regno);
		System.out.println("Name:" + name);
		System.out.println("Total score is:" + total_score);
		System.out.println("Result:" + result);
		System.out.println("Grade is:" + grade);

	}

	private int getTotal() {
		int total = 0;
		for (int score : subject_Scores) {
			total += score;
		}
		return total;
	}

	private String getResult() {
		for (int score : subject_Scores) {
			if (score < 35) {
				return "fail";
			}
		}
		return "pass";
	}

	private float getAverage() {
		int total = getTotal();
		int total_subs = subject_Scores.length;
		return total / (float)total_subs;
	}
	private String getGrade()
	{
		String result = getResult();
		float average = getAverage();
		if(result == "pass")
		{
			if(average>90 && average<=100)
			{
				return "A";
			}
			else if(average>=60 && average<=90)
			{
				return "B";
			}
			else
			{
				return "C";
			}
				
		}
		return "fail";
	}

}
