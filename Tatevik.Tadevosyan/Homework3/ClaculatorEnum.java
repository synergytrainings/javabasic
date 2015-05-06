package com.synisys.trainings;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ClaculatorEnum {
	enum Actions {

		PLUS, MINUS, MULTIPLICATION, DIVISION;

		public double Calculation(double firstOperand, double secondOperand) {
			double result = 0;
			switch (this) {
			case PLUS: {
				result = firstOperand + secondOperand;
				break;
			}
			case MINUS: {
				result = firstOperand - secondOperand;
				break;
			}
			case MULTIPLICATION: {
				result = firstOperand * secondOperand;
				break;
			}
			case DIVISION: {
				result = firstOperand / secondOperand;
				break;
			}
			default: {
				System.out.println("Incorrect operator");
			}

			}

			return result;

		}
	};

	public static void main(String[] args) {
		double firstOperand;
		double secondOperand;
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Please enter the first number");
			firstOperand = input.nextDouble();
			System.out.println("Please enter the second number");
			secondOperand = input.nextDouble();
			System.out
					.println("Please enter the operator (PLUS - +,MINUS - - ,MULTIPLICATION - * ,DIVISION - /)");
			Actions operation = Actions.valueOf(input.next());

			System.out.println(operation.Calculation(firstOperand,
					secondOperand));
		} catch (ArithmeticException | InputMismatchException exp) {
			System.out.println("Error");
		}

	}
}
