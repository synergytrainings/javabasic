package javaHomework2_2;

public class ArrayMaxValueRecursion {

	public static int RecMaxValue(int[] array1, int i) {

		if (i == 1) {
			return array1[0];
		}

		else {

			int MaxValue = RecMaxValue(array1, i - 1);
			return MaxValue > array1[i - 1] ? MaxValue : array1[i - 1];

		}
	}

	public static void main(String[] args) {

		int[] array1 = { 3, -5, 8, 12, -3 };
		int i = array1.length;
		System.out.println(RecMaxValue(array1, i));
	};
}
