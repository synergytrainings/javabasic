
public class H2_1 {

	private static int maxarr(int [] arr){
		int len = arr.length;
		int max = arr[0];
		int i;
		
		for (i = 0; i < len; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		
		return max;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] arrA = {7, 8, 12, 72, 15};
			System.out.print(maxarr(arrA));
	}

}
