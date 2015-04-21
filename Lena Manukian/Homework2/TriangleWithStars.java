
public class TriangleWithStars {

	private static void triangleWithArray(int n) {

		char[][] arr1 = new char[n][n];
		char[][] arr2 = new char[n][n];

		// initialize arrays with spaces
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr1[i][j] = ' ';
				arr2[i][j] = ' ';
			}
		}

		// set stars on left down side
		for (int k = 0; k < n; k += 2) {
			for (int i = 0; i < n - k; i++) {
				arr1[i + k][i] = '*';
			}
		}

		// set stars on right down side
		for (int k = 0; k < n; k += 2) {
			for (int i = 0, j = n - 1; i < n - k && j >= 0; i++, j--) {
				arr2[i + k][j] = '*';
			}
		}

		// print arr1 && arr2
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr2[i][j]);
			}

			for (int j = 1; j < n; j++) {
				System.out.print(arr1[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		triangleWithArray(10);
		System.out.println();

	}

}
