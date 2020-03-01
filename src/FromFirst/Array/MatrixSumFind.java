package FromFirst.Array;

import java.util.Scanner;

public class MatrixSumFind {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row and column:");
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] matrix = new int[row][col];
		System.out.println("Enter the values:");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.println("Entered elements are:");
				System.out.println(matrix[i][j] + " ");
			}
		}
		

	}

}
