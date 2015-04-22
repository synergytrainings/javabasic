package javaHomework2;

public class PrintTriangle {

	public static void main(String[] args) {

		int n = 4;

		for (int line = 1; line <= n; line++) {
			for (int i = n - line; i > 0; i--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= line; k++) {
				System.out.print("* ");
			}

			System.out.print("\n");
		}

	}

}
