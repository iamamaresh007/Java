package FromFirst.TypeCasting.Wrapper;

public class Quiz {
	private String title;
	private Question[] questions;
	private int count=0;
	public Quiz(String title)
	{
		this.title=title;
		this.questions=new Question[3];
	}
	public void addQuestion(Question question)
	{
		if(count<=questions.length)
		{
			questions[count++]=question;
		}
		else
		{
			System.out.println("Quiz can have only 3 questions....");
		}
	}
	public String getTitle() {
		return this.title;
	}
	
	public Question[] getQuestions() {
		return this.questions;
	}
	
	public int getCount() {
		return this.questions.length;
	}
	
	

}
