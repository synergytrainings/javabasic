import java.util.Scanner;

/**
 * Created by arthur.rafayelyan on 4/15/2015.
 */
public class IsEqual {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Please insert first String.");
        String firstString = in.nextLine();

        System.out.println("Please insert second String.");
        String secondString = in.nextLine();

        isEqual(firstString, secondString);

    }

    public static void isEqual(String a, String b){
        boolean equal = true;

        if (a.length() != b.length()) {
            System.out.println("Strings are not equal!");
            return;
        }

        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i) != b.charAt(i)){
                System.out.println("Strings are not equal!");
                equal = false;
                break;
            }
        }
        if(equal){
            System.out.println("Strings are equal!");
        }
    }
}
