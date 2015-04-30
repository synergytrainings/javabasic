package javaHomework2_1;

public class ArrayMaxValueIteration {

	public static void main(String[] args) {

		int[] array1 = { 3, -5, 8, 12, -3 };
		int Max = array1[1];

		for (int i = 2; i < array1.length; i++) {
			if (array1[i] > Max) {
				Max = array1[i];
			}
		}
		System.out.println("Maximum element of array is:" + Max);
	}

}
