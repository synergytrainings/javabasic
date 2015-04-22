
public class MaxElementOfArray2 {

	private static int maxElementOfArrayRecursive(int[] arr, int i, int j) throws java.lang.NullPointerException ,java.lang.ArrayIndexOutOfBoundsException{

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

		int[] smallPrimes = new int[0];
		try {

			System.out.println(maxElementOfArrayRecursive(smallPrimes, 0, 0));
		} catch (java.lang.NullPointerException e) {
			System.out.println("Error: you mast initialize arrays");
		}
		catch( java.lang.ArrayIndexOutOfBoundsException e){
			System.out.println("Error: may be array length = 0");
		}
		
	}

}
