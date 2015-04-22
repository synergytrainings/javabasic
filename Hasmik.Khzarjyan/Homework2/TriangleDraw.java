/** @author hasmik.khzarjyan */

public class TriangleDraw {

	public static void main(String[] args) {
		int k = 10;
		
		drawTriangle(k);

	}
	/**
	 * this method take integer parameter, and draw triangle.
	 * @param n
	 */
	public static void drawTriangle(int n){
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= n; j++){
				if (j <= n-i){
					System.out.print("  ");
				}else{
					System.out.print("*   ");
				}
			}
		System.out.println();
		}
	}

}
