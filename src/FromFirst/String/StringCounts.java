package FromFirst.String;

import java.util.Arrays;

public class StringCounts {
	public static void main(String[] args) {
		String str = "I am in banglore my house number is 6 and my phone number is 8971868110";
		char[] arr = str.toLowerCase().toCharArray();
		int count[] = getCount(arr);
		System.out.println("Alphabet counts:" + count[0]);
		System.out.println("Digit counts:" + count[1]);
		System.out.println("Space counts:" + count[2]);

	}

	private static int[] getCount(char[] arr) {
		int alp_count = 0, num_count = 0, space_count = 0;
		for (char c : arr) {
			if (c >= 'a' && c <= 'z') {
				alp_count++;
			} else if (c >= '0' && c <= '9') {
				num_count++;
			} else if (c == ' ') {
				space_count++;
			}
		}

		return new int[] { alp_count, num_count, space_count };

	}
}