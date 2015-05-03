package tt;

import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			Scanner in = new Scanner(System.in);
			System.out.println("enter new value");
			double x = in.nextDouble();
			double y;
			String m = "";
			boolean run1 = true;
			while (run1) {
				System.out
						.println("enter action or (e- for exit/ c - for start new calculation)");
				m = in.next();

				if (m.equals("e")) {
					run = false;
					System.out.println("Exit");
					in.close();
					break;
				}
				if (m.equals("c")) {
					run1 = false;
					break;

				}
				System.out.println("enter value");
				y = in.nextDouble();

				switch (m) {
				case "+":
					x = x + y;
					break;
				case "-":
					x = x - y;
					break;
				case "*":
					x = x * y;
					break;
				case "/":
					x = x / y;
					break;
				default:
					System.out.println("inccorect ation!");
					break;
				}

				System.out.println(x);
			}
		}
	}
}
