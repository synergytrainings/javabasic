package com.synisys.trainings;

import java.util.*;

public class Calculator {

    public static void main(String[] args) {

        double firstNumber;
        double secondNumber;
        double result = 0;
        String operator;

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Please enter the first number");
            firstNumber = input.nextDouble();
            System.out.println("Please enter the second number");
            secondNumber = input.nextDouble();
            System.out.println("Please enter the operator");
            operator = input.next();
            switch (operator) {
                case "+": {
                    result = firstNumber + secondNumber;
                    break;
                }
                case "-": {
                    result = firstNumber - secondNumber;
                    break;
                }
                case "*": {
                    result = firstNumber * secondNumber;
                    break;
                }
                case "/": {
                    result = firstNumber / secondNumber;
                    break;
                }
                default: {
                    System.out.println("Incorrect operator");
                }

            }
            System.out.print(firstNumber + " " + operator + " " + secondNumber
                    + " = " + result);
        } catch (ArithmeticException | InputMismatchException exp) {
            System.out.println("Error");
        }
    }

}
