import java.util.*;

public class Calculator {

	public static void main(String[] args) {

		System.out.println("please enter a number, an action and the a number to calculate result");
		//Scanner in = new Scanner(System.in);
		try(Scanner in = new Scanner(System.in)){
			// Scanner in = new Scanner(System.in);
			double d1 = in.nextDouble();

			String action = in.next();

			double d2 = in.nextDouble();

			switch (action) {

			case "+":
				System.out.println(d1 + d2);
				break;
			case "-":
				System.out.println(d1 - d2);
				break;
			case "*":
				System.out.println(d1 * d2);
				break;
			case "/":
				
					System.out.println(d1 / d2);
				
				break;
			default:
				System.out.println("you entered the action that program does not handle");
			}
			

		} 
		
		catch (IllegalStateException e) {
			System.out.println("there is an error with IO: Scanner is closed");
		}
		catch (InputMismatchException e) {
			System.out.println("cannot interpret your value as a number, please enter a valid value");
		} 
		catch (java.lang.ArithmeticException e) {
			System.out.println("error: you tried devide by 0");
		} 
		/*
		finally {
			if (in != null) {
				in.close();
			} else
				System.out.println("there is an error with IO: Scanner is closed");
		}
		*/
	}

}
