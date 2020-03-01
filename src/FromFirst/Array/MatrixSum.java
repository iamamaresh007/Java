package FromFirst.Array;

public class MatrixSum {
	public static void main(String[] args) {
		int[][] arr = new int[][] { { 1, 2, 3 }, { 5, 6, 7 }, { 9, 10, 11 } };

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}

		}
		System.out.println(sum);
	}
}