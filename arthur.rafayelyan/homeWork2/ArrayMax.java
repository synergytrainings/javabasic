import java.util.Arrays;

/**
 * Created by arthur.rafayelyan on 4/20/2015.
 */
public class ArrayMax {
    public static void main(String[] args) {

        int a[] = {2, 5, 3, 7, 8};

        int aLength = a.length;

        Arrays.sort(a);

        int max = a[aLength - 1];
        System.out.println(max);

    }
}
