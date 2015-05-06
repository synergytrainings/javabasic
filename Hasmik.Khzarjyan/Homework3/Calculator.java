import java.util.Scanner;

/**
 * 
 * @author hasmik.khzarjyan
 *
 */
public class Calculator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    String q;
     do{		
		System.out.println("Please, enter first value: ");
		double d1 = in.nextDouble();
		System.out.println("Please, enter operation symbol: ");
		String n = in.next();
		System.out.println("Please, enter second value: ");
		double d2 = in.nextDouble();
		
		
	 switch (n) {
	      case"+": System.out.println("result: " + (d1+d2));
	               break;
	      case"-": System.out.println("result: " + (d1-d2));
                    break; 
	      case"*": System.out.println("result: " + (d1*d2));
                   break;
	      case"/": System.out.println("result: " + (d1/d2));
                   break;
          default: System.out.println("you are input inccorect operation!");
                   break;
	 }
     System.out.println("For exit,please input 'q'!! For continue any other symbole!! ");
      q = in.next();
     }
     while (!"q".equals(q));
     in.close();
    		 
	}
	

	

}
