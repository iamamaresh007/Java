package FromFirst;

class Students
{
	String name;
	int roll;
	String adrress;
	
}

public class CodeDope {
	public static void main(String[] args) {
		Students s = new Students();
		s.name="Amar";
		s.roll=007;
		s.adrress="Ilkal";
		
		Students s1 = new Students();
		s1.name="Dhoni";
		s1.roll=7;
		s1.adrress="Ranchi";
		
		System.out.println("Name:" + s.name +" Roll:"+s.roll + " Address:"+s.adrress);
		System.out.println("Name:" + s1.name +" Roll:"+s1.roll + " Address:"+s1.adrress);
		
	}

}
