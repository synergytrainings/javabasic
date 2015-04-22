package tt;

public class MaxArrayRec {

	public static void main(String[] args) {
		int a[] = new int[] { 10, 11, -2088, 2, 12, 120 };
		int max = Max(a, a.length);
		System.out.println("Max valiue is: " + max);
	}

	public static int Max(int[] a, int length) {
		if (a == null) {
			throw new IllegalArgumentException(
					"Illegal Argument. Array is null.");
		}

		if (length == 1)
			return a[0];
		return MaxRec(Max(a, length - 1), a[length - 1]);
	}

	private static int MaxRec(int start, int second) {
		return start > second ? start : second;
	}

}

