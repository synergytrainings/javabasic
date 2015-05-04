import java.util.Scanner;

/**
 * Created by arthur.rafayelyan on 5/3/2015.
 */
public class Calculator {
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double answer = 0;


            System.out.print("Please enter your first number: ");
            double firstNumber = in.nextDouble();

            System.out.print("Please enter your operator: ");
            char operator = in.next().trim().charAt(0);

            System.out.print("Please enter your second number: ");
            double secondNumber = in.nextDouble();

            switch (operator) {
                case '+': answer = firstNumber + secondNumber;
                    break;
                case '-': answer = firstNumber - secondNumber;
                    break;
                case '*': answer = firstNumber * secondNumber;
                    break;
                case '/': answer = firstNumber / secondNumber;
                    break;
            }
            System.out.println("Your result is "  + answer);
        }
}