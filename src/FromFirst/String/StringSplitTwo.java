package FromFirst.String;

public class StringSplitTwo {
	public static void main(String[] args) {
		String data ="Amaresh,007,NCET,CS-Vishwa,401,NCET,MECH-Dhoni,7,B.Com";
		String[] persons = data.split("-");
		String[] person = persons[0].split(",");
		int n = persons.length;
		int c=0;
		for(int i=0;i<n;i++)
		{
		String name = person[0];
		String usn = person[1];
		String College = person[2];
		String branch = person[3];
		System.out.println(name);
		System.out.println(usn);
		System.out.println(College);
		System.out.println(branch);
		System.out.println("_________________________");
		}
		
	}

}
