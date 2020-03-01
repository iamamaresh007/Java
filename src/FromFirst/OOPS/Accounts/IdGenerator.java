package FromFirst.OOPS.Accounts;

public final class IdGenerator {
	private static int id=1001;
	private IdGenerator()
	{
		
	}
	public static int getId()
	{
	   return id++;
	}

}
