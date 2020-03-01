package FromFirst.OOPS.five;

public class IdGenerator {
	private static int id = 101;
	private IdGenerator()
	{
		
	}
public static int getId()
{
	//Logic
	return id++;
	
}
}
