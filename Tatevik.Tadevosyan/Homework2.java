package com.synisys.trainings;

import java.util.Arrays;

public class Homework2 {
	public static int maxElementIter(int[] a) {
		if (a == null || a.length == 0) {
			throw new IllegalArgumentException("Array must not be empty.");
		}
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		return max;
	}

	public static int maxElementRec(int[] a) {
		if (a == null || a.length == 0) {
			throw new IllegalArgumentException("Array must not be empty.");
		}
		int length = a.length;
		if (length == 1) {
			return a[0];
		}

		return Math.max(a[length - 1],
				maxElementRec(Arrays.copyOfRange(a, 0, length - 1)));

	}

	public static void printTriangle(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("\n ");
			printSpace(n - i - 1);
			for (int j = 1; j <= i + 1; j++) {
				System.out.print("*" + " ");
			}

		}
	}

	private static void printSpace(int n) {
		for (int i = 0; i < n; i++) {

			System.out.print(" ");
		}
	}

	public static int[][] matirxMultiplication(int firstMatrix[][],
			int secondMatrix[][]) {
		if (firstMatrix == null || firstMatrix.length == 0
				|| secondMatrix == null || secondMatrix.length == 0) {
			throw new IllegalArgumentException("Array must not be empty.");
		}
		int n = firstMatrix.length;
		int m = firstMatrix[0].length;
		int p = secondMatrix.length;
		int q = secondMatrix[0].length;

		if (m != p) {
			throw new RuntimeException("Illegal matrix dimensions.");
		}
		int[][] c = new int[n][q];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < q; j++) {
				for (int k = 0; k < m; k++) {
					c[i][j] += (firstMatrix[i][k] * secondMatrix[k][j]);
				}
			}

		}
		return c;
	}

	public static void main(String[] args) {
		int ary[] = { 1005, 4, 5, 6, 8000 };
		System.out.println(maxElementIter(ary));
		System.out.println(maxElementRec(ary));
		printTriangle(4);
		int[][] matrix1 = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		int[][] matrix2 = { { 1, 2 }, { 3, 4 } };
		int c[][] = matirxMultiplication(matrix1, matrix2);
		int k = c.length;
		int m = c[0].length;
		System.out.println(" ");
		for (int i = 0; i < k; i++) {
			System.out.println("\n");
			for (int j = 0; j < m; j++) {
				System.out.print(c[i][j] + " ");
			}
		}
	}

}
