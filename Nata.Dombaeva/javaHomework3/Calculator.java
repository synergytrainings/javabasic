package Homework3;
import java.util.Scanner;


public class Calculator {
	public static void main (String[] args) {
		
	Scanner in = new Scanner(System.in);
	
	System.out.println ("Input first argument, please");
	double arg1 = in.nextDouble();
	
	System.out.println ("Input operation, please");
	char operation = in.next().charAt(0);
	
	System.out.println ("Input second argument, please");
	double arg2 = in.nextDouble();
	
	switch (operation) {
		case '+' : System.out.println ("Result is: " + (arg1 + arg2));
		break;
		case '-' : System.out.println ("Result is: " + (arg1 - arg2));
		break;
		case '*' : System.out.println ("Result is: " + (arg1 * arg2));
		break;
		case '/' : 
				if (arg2 == 0)
					System.out.println ("Division by zero!");
					
				else System.out.println ("Result is: " + (arg1 / arg2));
		break;
	}
	
	 in.close();	
		
	}

}

