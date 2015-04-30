package javaHomework2_3;

public class MatrixMultiplication {

	public static int[][] Matrix(int[][] a, int[][] b) {

		int rowcount1 = a.length;

		int columncount1 = a[0].length;
		int columncount2 = b[0].length;

		int[][] c = new int[rowcount1][columncount2];

		for (int i = 1; i <= rowcount1; i++) {
			for (int j = 1; j <= columncount2; j++) {
				for (int m = 1; m <= columncount1; m++)
					c[i][j] += a[i][m] * b[m][j];
			}
		}

		return c;
	}

	public static void main(String[] args) {

		int[][] a = { { 1, 2 }, { 3, 4 }, { 5, 6 } };

		int[][] b = { { 1, 2 }, { 3, 4 } };

		int c[][] = Matrix(a, b);
		int rowcount1 = c.length;
		int columncount2 = c[0].length;

		for (int i = 1; i <= rowcount1; i++) {
			for (int j = 1; j <= columncount2; j++) {
				System.out.print(c[i][j]);
			}
			System.out.println("\n");

		}
	}
}
