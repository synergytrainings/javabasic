/**
 * Created by arthur.rafayelyan on 4/20/2015.
 */
public class ArrayRecMax {
    public static void main(String[] args) {
        int[] arr = {5, 15, 23, 2115, 11};
        int max = recursiveMax(arr, arr.length);
        System.out.println("Maximum element: " + max);
    }

    static int recursiveMax(int[] arr, int length) {
        if (length == 1) {
            return arr[0];
        } else {
            return max(recursiveMax(arr, length - 1), arr[length - 1]);
        }
    }

    private static int max(int n1, int n2) {
        if (n1 > n2) {
            return n1;
        } else {
            return n2;
        }
    }
}
