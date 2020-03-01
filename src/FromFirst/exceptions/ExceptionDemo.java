package FromFirst.exceptions;

public class ExceptionDemo {
	public static void main(String[] args) {
		String data = "Amaresh,Yash,Dhoni,Gan,Allu Arjuna";
		for(String name:data.split(","))
		{
			try {
			System.out.println(name.substring(0,4).toUpperCase());
			}
			catch(StringIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			}
			
		}
	}

}
