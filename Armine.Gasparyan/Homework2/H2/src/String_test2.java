package String_test2;

public class String_test2 {

	public static void main(String[] args) {
		methodOne(7);
		// methodTwo(25);

		int s = 5;
		int[][] a = { { 1, 2 }, { 3, 4 }, { 5, 66 } };
		int[][] b = { { 1, 2 }, { 3, 4 } };

		int[][] c = new int[5][5];
		for (int x = 0; x < a[0].length; x++) {
			for (int y = 0; y < a.length; y++) {
				System.out.print(a[x][y]);
				//c[x][y] = a[x][y] * b[x][y];
			}
		}

	}

	static void methodOne(int a) {

		int i, j, m, k, n;
		n = a;
		k = a;
		m = 0;
		j = 0;

		for (i = 0; i < k; i++) {
			for (j = 1; j < k - n + i; j++) {
				while (m < n) {
					System.out.print(' ');
					m++;
				}
				System.out.print('*');
			}
			System.out.print('\n');
			n = n - 1;
			m = 0;
		}
		System.out.print('\n');
		// /######################################
		n = a;
		k = a;
		m = 0;
		// j = 0;

		for (i = 1; i <= k; i++) {
			for (j = 0; j < k - n; j++) {

				while (m < n) {
					System.out.print(' ');
					m++;
				}
				System.out.print("* ");
			}
			System.out.print('\n');
			n = n - 1;
			m = 0;
		}

	}

}
