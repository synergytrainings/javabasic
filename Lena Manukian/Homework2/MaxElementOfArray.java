
public class MaxElementOfArray {

	private static int maxElementOfArrayWithLoop(int[] arr) throws java.lang.NullPointerException {
		int len = arr.length;
		int max = arr[0];
		for (int i = 1; i < len; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}

		}

		return max;
	}

	private static int maxElementOfArrayRecursive(int[] arr, int i, int j) throws java.lang.NullPointerException {

		if (arr[i] >= arr[j]) {
			// if out of ranges
			if (j == arr.length - 1) {
				return arr[i];
			}
			// else invoke with j++
			else
				return maxElementOfArrayRecursive(arr, i, ++j);
		}

		else {
			if (i == arr.length - 1) {
				return arr[j];
			} else
				return maxElementOfArrayRecursive(arr, ++i, j);
		}

	}

	public static void main(String[] args) {

		int[] arr = { 1, 3, 1, 5, 2, 9 };

		try {

			System.out.println(maxElementOfArrayWithLoop(arr));

			System.out.println(maxElementOfArrayRecursive(arr, 0, 0));
		} catch (java.lang.NullPointerException e) {
			System.out.println("Error: you mast initialize arrays");
		}
	}

}
