
import java.util.Scanner;

import javax.swing.JLabel;

public class Calculator {

	public static void main(String[] args) {

		JLabel label = new JLabel("34");
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the first number.");
		double number1 = in.nextDouble();

		System.out.println("Please enter the second number.");
		double number2 = in.nextDouble();

		System.out.println("Please enter the operation you want to performe.");
		String operation = in.next();
		try {
			switch (operation) {
			case ("+"): {
				System.out.println(number1 + number2);
				break;
			}
			case ("-"): {
				System.out.println(number1 - number2);
				break;
			}

			case ("*"): {
				System.out.println(number1 * number2);
				break;
			}
			case ("/"): {
				System.out.println(number1 / number2);
				break;
			}
			default: {
				System.out
						.println("You entered the wrong operation! Please try again.");
			}
			}

		} catch (Exception exception) {
			System.out.println(label.getText() + " is not a number");
		} finally {
			in.close();
		}

	}
}
