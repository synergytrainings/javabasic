
public class MultiplyingMatrixes {

	private static void multiply(int[][] matr1, int[][] matr2)
			throws java.lang.NullPointerException, java.lang.Exception {

		int row = matr1[0].length;
		int column = matr2[0].length;

		if (row != matr2.length) {
			throw new java.lang.Exception();
		}

		int[][] newMatrix = new int[matr1.length][matr2[0].length];

		for (int i = 0; i < row; i++) {

			for (int k = 0; k < row; k++) {
				// set sum to 0 every time when column of matr2 is changed
				int sum = 0;

				for (int j = 0; j < column; j++) {

					sum += matr1[i][j] * matr2[j][k];
				}
				newMatrix[i][k] = sum;
			}
		}

		// print result
		int l1 = matr1.length, l2 = matr2[0].length;
		for (int i = 0; i < l1; i++) {
			for (int j = 0; j < l2; j++) {

				System.out.print(newMatrix[i][j] + "  ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		int[][] matr1 = { { 1, 1 }, { 1, 1 } };
		int[][] matr2 = { { 1, 1 }, { 1, 1 } };

		try {
			multiply(matr1, matr2);
		} catch (java.lang.NullPointerException e) {
			System.out.println("one of matrixes is reference to null");
		} catch (java.lang.Exception e) {
			System.out.println("the row length of matr1 != column length of matr2");
		}

	}

}
