
public class AlgorithmForMatrixMultiplication {

	public static void main(String[] args) {

		int[][] arr1 = { { 1, 2 }, { 3, 4 }, { 5, 6 }, { 5, 6 } };

		int[][] arr2 = { { 1, 2 }, { 3, 4 } };

		int[][] result = new int[arr1.length][arr2[0].length];

		for (int m = 0; m < arr1.length; m++)
			for (int n = 0; n < arr2[0].length; n++)
				for (int k = 0; k < arr1[0].length; k++)
					result[m][n] += arr1[m][k] * arr2[k][n];

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2[0].length; j++) {
				System.out.println(" " + result[i][j]);
			}
			System.out.println();
		}

	}
}
