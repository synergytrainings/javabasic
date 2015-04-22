/** @author hasmik.khzarjyan */

public class MaxElement {

	public static void main(String[] args) {
        int[] array = {-3,5,-10,56,0,-2,74,34};
        
        if (array == null || array.length == 0){
        	System.out.println("It is incorrect input. Please initialize array!");
        } else {
        	int n = array.length - 1;	
            System.out.printf("Max element of this array is: %d \n",maxElementOfArray(array));
            System.out.printf("Max element of this array with recursion is: %d ",maxElementByRecursion(array,n));
        }
	}
	/**
	 * this method take an array and return max element of this array.
	 * @param int[] x
	 * @return max (int)
	 */
	public static int maxElementOfArray(int[] x){
		int max = x[0];
		int l = x.length;
		if (l > 1){
			for (int i = 1; i < l; i++){
				if (x[i] > max){
					max = x[i];
				}
			}
		}
		return max;
	}
	/**
	 * this method take an array and return max element of this array use recursion 
	 * @param int[] x, int i
	 * @return max (int)
	 */
	public static int maxElementByRecursion(int[] x,int i){
	   int temp;
	   if (i == 0){
		   return x[i];
	   }
	   temp = maxElementByRecursion(x,i-1);
	   return (x[i] > temp)? x[i]:temp;   
	}
		
}
