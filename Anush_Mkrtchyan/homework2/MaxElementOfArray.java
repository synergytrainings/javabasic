import java.util.Arrays;

public class MaxElementOfArray {

	public static void main(String[] args) {

		int[] array = { 100, 130000, -3, 80, 9, 1, 10 };
		FindMaxElement(array);
		System.out.println("The max element of array is: " + FindMaxElementWhithRecursion(array));

	}

	public static int FindMaxElement(int[] array)
			throws java.lang.NullPointerException {

		int max = array[0];

		for (int i = 0; i < array.length; i++) {

			if (max < array[i])
				max = array[i];
		}

		System.out.println("The max element of array is: " + max);
		return max;
	}

	public static int FindMaxElementWhithRecursion(int[] array)
			throws java.lang.NullPointerException {

		if (array.length == 1)
			return array[0];

		return array[array.length - 1] > FindMaxElementWhithRecursion(Arrays
				.copyOfRange(array, 0, array.length - 1)) ? array[array.length - 1]
				: FindMaxElementWhithRecursion(Arrays.copyOfRange(array, 0,
						array.length - 1));

	}

}