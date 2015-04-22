import java.util.Random;
import java.util.Scanner;

/**
 * Created by ani.marutyan on 4/22/2015.
 */
public class MaxElement {
    public static int MaxIteration(int[] array, int size) {
        int maxElement = array[0];
        for (int i = 0; i < size; i++) {
            if (maxElement < array[i]) {
                maxElement = array[i];
            }
        }
        return maxElement;
    }

    public static int MaxRecursively(int [] array, int size){
            if (size == 0)
            {
                return array[0];
            }
            else {
                return Math.max(MaxRecursively(array, size - 1), array[size -1]);
            }
    }

    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the size of the array");
        n = sc.nextInt();

        if (n == 0){
            System.out.println("Your array is empty");
        }
        else {
            int[] a = new int[n];
            Random rn = new Random();
            for (int i = 0; i < n; i++) {
                a[i] = rn.nextInt(100) + 1;
                System.out.println(a[i]);
            }
            System.out.println("The max element of this array is " + MaxIteration(a, n));
            System.out.println("The max element of this array is " + MaxRecursively(a, n));
        }
    }
}