/** @author hasmik.khzarjyan */

public class MultiplyMatrix {
    
	public static void main(String[] args) {
		int[][] a =  {{1,2,3},{2,3,2}};
		int[][] b =  {{3,2,1,2},{2,1,1,2},{1,1,1,3}};
		
		if (a == null || b == null){
			System.out.println("Matrixs can not be null");
		} else if (a.length == 0 || b.length == 0){
			System.out.println("Matrix can not be empty");
		}else{
			multiply(a,b);
		}
		
	}
	/** this method take 2 matrix and return their multiply, if it's possible. 
	*/
	public static void multiply(int[][] a,int[][] b){
		 int k = a.length;
		 int p = a[0].length;
		 int q = b.length;
		 int g = b[0].length;
		 if (p != q){
			System.out.println("This matrix can not be multiply.Insert correct range!!");
		 }else{
		
		 int[][] result = new int[k][g];
		  for (int i = 0; i < k; i++){
			  for(int j = 0; j < g; j++){
				  for(int c = 0; c < p; c++){
					  result[i][j] += a[i][c]*b[c][j];
				  }
			  }
		  }
		  ToString(result);
		 }
	  }
	  
	  /** this method takes matrix and print it.
	  */
	  public static void ToString(int[][] x){
		  int n = x.length;
		  int m = x[0].length;
		  for (int i = 0; i < n; i++){
			  System.out.print("{ ");
			  for (int j = 0; j < m; j++){
				  System.out.print(x[i][j] + " ");
			  }
			  System.out.print("} \n");
	      } 
	  }	  

}
