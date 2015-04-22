
public class TriangleWithStars_2 {
	
	private static void triangle(int n){
		
		for(int i = n - 1; i>= 0; i--){
			//print spaces
			for(int j = 0; j <= i; j++){
			
				System.out.print(" ");
			}
		    for(int star = 0; star < n -i; star++){
		    	System.out.print("* ");
		    }
			System.out.println();
		}
		
	}

	public static void main(String[] args){
		
		triangle(10);
	}
}
