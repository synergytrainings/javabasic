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

    public static boolean isEqual(String a, String b){

        if (a.length() != b.length()) {
            System.out.println("String are not equal");
            return false;
        }else {
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) != b.charAt(i)) {
                    System.out.println("String are not equal");
                    return false;
                }

            }
        }
        System.out.println("String are equal");
        return true;
    }

}
