package tt;

public class MaxArrayIt {

	public static void main(String[] args) {
		int[] a = new int[]{9, 20, 7, 5,20, };
		int k =  a.length;
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < k; i++) {
		      if  (a[i] > max) {
		         max = a[i];
		      }
		}
		System.out.println("Max valiue is "+ max );

	}

}
