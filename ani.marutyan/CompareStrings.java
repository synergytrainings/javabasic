
import java.util.Scanner;

/**
 * Created by Ani.Marutyan on 4/15/2015.  updated
 */
public class StringComparison {

    public static boolean CompareStrings ( String first_string, String second_string ){
        
        if (first_string.length() == second_string.length()){
            
            int i = 0;
            while ( i < first_string.length() ) {
                if (first_string.charAt(i) == second_string.charAt(i))
                    i++;
                else break;
            }
    
            if ( i == first_string.length() )
                return true;
                
        else
            return false;
        }
        else
            return false;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        String st1;
        String st2;
        System.out.println("Please input the first character string: ");
        st1 = input.nextLine();;
        System.out.println("And the second one: ");
        st2 = input.nextLine();;
        
      	
        if (st1 == st2 || CompareStrings (st1, st2))
            System.out.println("The strings match");
        else
            System.out.println("The strings don't match");

    }



}
