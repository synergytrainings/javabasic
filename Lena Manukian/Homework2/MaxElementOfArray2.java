
public class MaxElementOfArray2 {

	private static int maxElementOfArrayRecursive(int[] arr, int i, int j) throws java.lang.NullPointerException {

		if (arr[i] >= arr[j]) {
			// if out of ranges
			if (i == arr.length - 1) {
				return arr[i];
			}
			// else invoke with j++
			else
				return maxElementOfArrayRecursive(arr, i, i + 1);
		}

		else {
			if (j == arr.length - 1) {
				return arr[j];
			} else
				return maxElementOfArrayRecursive(arr, j + 1, j);
		}

	}

	public static void main(String[] args) {

		int[] smallPrimes = { 2, 3, 5, 7, 11, 13 };
		System.out.println(maxElementOfArrayRecursive(smallPrimes, 0, 0));
		
	}

}
