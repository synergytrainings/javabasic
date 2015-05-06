import java.util.Scanner;

public class H3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.print("Please enter the number of arguments :");
		int i = in.nextInt();
		double[] x = new double[i];
		char[] s = new char[i - 1];

		int j;
		for (j = 0; j < i; j++) {
			System.out.print("x[" + j + "] = ");
			x[j] = in.nextDouble();
			if (j < i - 1) {
				System.out.print("s[" + j + "] = ");
				s[j] = in.next().charAt(0);
			}

		}

		Double xyz = x[0];
		j = 0;
		for (j = 0; j < i - 1; j++) {
			switch (s[j]) {
			case '+':
				xyz = xyz + x[j + 1];
				break;
			case '-':
				xyz = xyz - x[j + 1];
				break;
			case '*':
				xyz = xyz * x[j + 1];
				break;
			case '/':
				if (x[j + 1] != 0)
					xyz = xyz / x[j + 1];
				else
					System.out.println("Division by zero!");
				break;
			}
		}

		System.out.println("Result is: " + xyz);
	}
}
