package FromFirst.Array;

public class CountPalindromes {
	public static void main(String[] args) {
		String arr[] = { "123", "aba", "abc", "xyx", "NOON" };
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			//boolean check = checkPlaindrome(arr[i]);
			if (checkPalindrome(arr[i])) {
				count++;
			}
		}
		System.out.println("No.of palindromes:" + count);

	}

	private static boolean checkPalindrome(String string) {
		/*StringBuffer sb = new StringBuffer(string);
		String rev_String = sb.reverse().toString();
		if (string.equals(rev_String)) 
		{
			return true;
		}
		return false;
*/
		return string.equals(new StringBuffer(string).reverse().toString());
	}

}
