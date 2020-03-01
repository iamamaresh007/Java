package FromFirst;

class Instance
{
	String nam="AA";
	int roll=777;
	 public void PrintDetails()
	 {
		 System.out.println(nam);
		 System.out.println(roll);
	 }
}
public class InstanceVariables {
	public static void main(String[] args) {
		Instance i  = new Instance();
		i.nam="Amar";
		i.roll=7;
		i.PrintDetails();
		
	}

}
