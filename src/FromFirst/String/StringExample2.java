package FromFirst.String;

public class StringExample2 {

	public static void main(String[] args) {
		String s1="A book on java";
		String s2=new String("I like it");
		char[] arr= {'i',' ','w','a','n','t',' ','t','o',' ','l','e','a','r','n'};
		String s3=new String(arr);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println(s1.length());
		System.out.println("s1 and s2 is joined=" + s1.concat(s2));
		System.out.println(s1 +" from " +s3);
		
		boolean x=s1.startsWith("A");
		if(x)
		{
			System.out.println("starts with A");
		}
		else
		{
			System.out.println("it doesnot starts with A");
		}
		String p =s2.substring(0,7);
		String q = s3.substring(0,9);
		System.out.println(p);
		System.out.println(q);
		System.out.println(p+q);
		
		System.out.println("Lowercase s1"+s1.toLowerCase());
		System.out.println("Uppercase s1:"+s1.toUpperCase());
		
		System.out.println(p.toUpperCase());
		
		

	}

}
