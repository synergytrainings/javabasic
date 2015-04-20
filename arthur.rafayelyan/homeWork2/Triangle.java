import java.util.Scanner;

/**
 * Created by arthur.rafayelyan on 4/20/2015.
 */
public class Triangle {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Please insert rows number .");
        int count = in.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.println(" ");
            for (int j = 0; j < count - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i + 1; k++) {
                System.out.print("* ");
            }
        }
    }

}
