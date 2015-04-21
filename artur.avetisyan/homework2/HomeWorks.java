public class HomeWorks {

	public static void main(String[] args) {
		int[] a = new int[4];
		a[0] = 9;
		a[1] = 7;
		a[2] = 10;
		a[3] = 8;
		//homework 2.
		// System.out.println(maxEl(a, 4));
		
		//homeWork 3.
		// printTriangle3(20);
		
		// homework 1.

		int[][] b = {{3, 4}};
		int[][] c = { { 1, 2 }, { 3, 4 } };
		if (b.length == 0 || c.length == 0) {
			System.out.println("Array is empty");
		} else if (b[0].length != c.length) {
			System.out.println("Cannot Multiply");
		} else {
			int[][] result = multyplyArrays(b, c, b.length, c.length,
					c[0].length);
			for (int i = 0; i < result.length; i++) {
				for (int j = 0; j < result[0].length; j++) {
					System.out.print(result[i][j] + " ");
				}
				System.out.println();
			}
		}
	}

	public static int maxEl(int[] a, int n) {
		if (n == 1)
			return a[0];
		int k = maxEl(a, n - 1);
		return k <= a[n - 1] ? a[n - 1] : k;

	}

	public static void printTriangle1(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.print("*");
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void printTriangle2(int n) {

		int k = 2 * n - 1;
		char[][] b = new char[n][k];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < k; j++) {
				b[i][j] = ' ';
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				b[j][n - j + 2 * i - 1] = '*';
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < k; j++) {
				System.out.print(b[i][j]);

			}
			System.out.println();
		}
	}

	public static void printTriangle3(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2 * n - 1; j++) {
				if (j >= n - 1 - i && j <= n - 1 + i && (n - 1 - i) % 2 == 0
						&& j % 2 == 0 || j >= n - 1 - i && j <= n - 1 + i
						&& (n - 1 - i) % 2 == 1 && j % 2 == 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static int[][] multyplyArrays(int a[][], int b[][], int m, int n,
			int q) {
		int[][] c = new int[m][q];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < q; j++) {
				int s = 0;
				for (int j2 = 0; j2 < n; j2++) {
					s += a[i][j2] * b[j2][j];
				}
				c[i][j] = s;
			}
		}
		return c;
	}
}
