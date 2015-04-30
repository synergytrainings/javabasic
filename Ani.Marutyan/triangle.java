import java.util.Scanner;

/**
 * Created by ani.marutyan on 4/20/2015.
 */
public class Triangle {
    public static void Triangle (int size){

        char [][] triangle = new char[size][2*size-1];

        for (int i = 0; i < size; i ++) {
            for (int j = (size-1-i); j <= (size-1+i); j+=2) {
                    triangle[i][j] = '*';
            }
        }
        for (int i = 0; i < size; i ++) {
            for (int j = 0; j < 2*size-1; j++) {
                System.out.print(triangle[i][j]);
            }
            System.out.println();
        }
    }
    public static void main (String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the size of the triangle");
        n = sc.nextInt();

        Triangle (n);
    }
}
