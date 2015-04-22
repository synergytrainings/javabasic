import java.util.Random;
import java.util.Scanner;

/**
 * Created by ani.marutyan on 4/20/2015.
 */
public class MatrixMultiplication {

    public static void MatrixMultiplication (int [] [] mat1, int row1, int col1, int [] [] mat2, int col2){
        int [] [] c = new int [row1] [col2];

        System.out.println("The multiplication result will be:");
        for (int i = 0; i < row1; i++){
                for (int k = 0; k < col2; k++) {
                    for (int j = 0; j < col1; j++) {
                        c[i][k] += mat1[i][j] * mat2[j][k];
                }
                    System.out.printf("%5s", c[i][k]);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int a_rows ;
        int a_columns ;
        int b_columns ;

        Scanner sc = new Scanner(System.in);
        System.out.print("Give the first matrix row number: ");
        a_rows = sc.nextInt();
        System.out.print("Give the first matrix columns number (which also has to be the row number of the second matrix): ");
        a_columns = sc.nextInt();
        System.out.print("Give the second matrix columns number: ");
        b_columns = sc.nextInt();

        int [] [] a = new int[a_rows][a_columns];
        int [] [] b = new int[a_columns][b_columns];

        System.out.println("First matrix:");
        Random rn = new Random();
        for (int i = 0; i < a_rows; i++){
            for (int j = 0; j < a_columns; j++){
                a[i][j] = rn.nextInt(10)+1;
                System.out.printf("%2s", a[i][j]);
            }
            System.out.println();
        }

        System.out.println("Second matrix:");
        for (int i = 0; i < a_columns; i++){
            for (int j = 0; j < b_columns; j++){
                b[i][j] = rn.nextInt(10)+1;
                System.out.printf("%2s", b[i][j]);
            }
            System.out.println();
        }

        MatrixMultiplication(a, a_rows, a_columns, b, b_columns );
    }

}
