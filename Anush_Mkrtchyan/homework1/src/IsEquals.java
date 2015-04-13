import java.util.*;

/**
 * This program checks two strings are equal
 * without using equals() function
 * 
 * @author anush.mkrtchyan
 *
 */
public class IsEquals {
            
	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Input the first string!");
		String string1 = in.nextLine();
		
		System.out.println("Input the second string!");
		String string2 = in.nextLine();
		
        IsStringsEqual (string1, string2);
	
	}
	
	public static void IsStringsEqual (String string1, String string2) {
		
		if(string1.length() != string2.length()) {
			
			System.out.println("The strings are not equal!!");
			return;
			
		}
		if(string1 == string2) {
			
			System.out.println("The strings are equal :)");
			return;
		
		}
		for(int i = 0; i < string1.length(); i++) {
			
			if(string1.charAt(i) != string2.charAt(i)) {
				
				System.out.println("The strings are not equal!!");
				return;
			}
			
		}
		
		System.out.println("The strings are equal :)");
	}
}
