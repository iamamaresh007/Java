package HackerRank;

class sports
{
	String get_name()
	{
		return "Generic Sports";
	}
	void get_number_of_team_members()
	{
		System.out.println("Each team has n players in " +get_name());
	}
	
}

class Soccer extends sports
{
	String get_name()
	{
		return "Soccer Sports";
	}
	void get_number_of_team_members()
	{
		System.out.println("Each team has 11 players in " +get_name());
	}
	
}

public class MethodOverriding {
	 public static void main(String[] args) {
		 sports c1 = new sports();
		 Soccer c2 = new Soccer();
		 
		 System.out.println(c1.get_name());
		 c1.get_number_of_team_members();
		 
		 System.out.println(c2.get_name());
		 c2.get_number_of_team_members();
		 
		
	}
		
	

}
