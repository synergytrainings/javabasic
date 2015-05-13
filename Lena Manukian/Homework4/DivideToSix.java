
public class DivideToSix {
	private static boolean div(String s) {
		int sum = 0;
		int len = s.length();

		for (int i = 0; i < len; i++) {
			sum += Character.digit(s.charAt(i), 10);
			System.out.println(sum);
		}
		// if sum isn't a digit then enter into recursion
		if (sum >= 10) {
			return div(sum + "");
		} else if (sum == 0 || sum == 3 || sum == 6 || sum == 9) {
			return true;
		} else
			return false;
	}

	public static void main(String[] args) {
        
		
		String s = "123456123456";
		int k = (int)(Character.digit(s.charAt(s.length() - 1), 10));
		int l = k & 1;
		if(l == 0){
			System.out.println(div(s));
		}
		
	}

}
