
public class AlgorithmForMatrixMultiplication {

	public static void main(String[] args) {

		int[][] arr1 = { { 1, 2 }, { 3, 4 }, { 5, 6 }};

		int[][] arr2 = { { 1, 2 }, { 3, 4 } };

		int[][] result = new int[arr1.length][arr2[0].length];

		for (int m = 0; m < arr1.length; m++)
			for (int k = 0; k < arr2[0].length; k++)
				for (int n = 0; n < arr2.length; n++)
					result[m][k] += arr1[m][n] * arr2[n][k];

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2[0].length; j++) {
				System.out.print(result[i][j] + " " );
			}
			System.out.println();
		}

	}
}
