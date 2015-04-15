/** @author hasmik.khzarjyan */

public class StringEquals {
	
	public static void main(String[] args){
		
		String x = "abc";
		String y = new String("abc");
		Boolean isEqual = isEquals(x,y);
		System.out.println(isEqual);
	}
/** 
 * this method compare 2 strings and return true if it's equals
 * 
 * @param two strings
 * @return type boolean
 * 
 */	
	/* second version!! */
	public static boolean isEquals(String a, String b){
		Boolean bool = false;
		if (a != null && b != null && a == b){
			bool = true;
		} else if (a.length() == b.length()){
			bool = true;
			for(int i = 0; i<a.length(); i++){
				if  (a.charAt(i) != b.charAt(i)) {
					bool = false;
					break;
				}
			}
		}

       return bool;
	} 
      /* first version */	
     /* public static boolean isEquals(String a, String b){
		Boolean bool = false;
		if (a != null && b != null && a.length() == b.length() && a.length() != 0){
			bool = true;
			for(int i = 0; i<a.length(); i++){
				if  (a.charAt(i) != b.charAt(i)) {
					bool = false;
					break;
				}
			}
		}
        return bool;
	}  
	*/
	
	
}

