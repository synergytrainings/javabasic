/**
 * Created by arthur.rafayelyan on 4/21/2015.
 */
public class ArraysMultiplication {

    public static void main(String[] args) {
        int[][] firstArray = {
                {1,2},
                {3,4},
                {5,6}
        };

        int[][] secondArray = {
                {1,2},
                {3,4}
        };

        int[][] multipliedArrays = multiplication(firstArray,secondArray);
        mprint(multipliedArrays);
    }

    public static int[][] multiplication(int[][] m1, int[][] m2) {
        int m1rows = m1.length;
        int m1cols = m1[0].length;
        int m2rows = m2.length;
        int m2cols = m2[0].length;
        if (m1cols != m2rows) {
            System.out.print("Matrices don't match:");
        }
        int[][] result = new int[m1rows][m2cols];

        // multiply
        for (int i = 0; i < m1rows; i++) {
            for (int j = 0; j < m2cols; j++) {
                for (int k = 0; k < m1cols; k++) {
                    result[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return result;
    }

    /*Print a matrix*/
    public static void mprint(int[][] a) {
        int rows = a.length;
        int cols = a[0].length;
        for (int i=0; i < rows; i++) {
            System.out.print("{");
            for (int j=0; j<cols; j++)
                System.out.print(" " + a[i][j] + ",");
            System.out.println("}");
        }
    }
}
