import java.util.Scanner;


public class TriangleForGivenN {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("How many '*' should each edge have? ");
		int count = in.nextInt();
		
		for(int i = count; i <= 1; i--) {
			
			for(int j = 1; j < i; j++){
				System.out.println(" ");
			}
			for(int k = i; k <= count; k++) {
				System.out.println("* ");
			}
		}
	}
}
