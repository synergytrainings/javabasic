package String_test2;

public class matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ci, cj, x, y;

		int[][] a = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		int[][] b = { { 1, 2 }, { 3, 4 } };

		if (a.length > b.length)
			ci = a.length;
		else
			ci = b.length;
		if (a[1].length > b[1].length)
			cj = a[1].length;
		else
			cj = b[1].length;

		int[][] c = new int[ci][cj];

		for (int i = 0; i < c.length; i++)
			for (int j = 0; j < c[1].length; j++) {
				x = 0;
				y = 0;

				do {
					c[i][j] = c[i][j] + a[i][x] * b[y][j];
					x++;
					y++;
				} while (x < a.length && y < b.length);
				System.out.print("c[" + i + "][" + j + "]: ");
				System.out.println(c[i][j]);
				System.out.print('\n');
			}

	}

}
