
public class StringTest {
	private static boolean ifEquale(String s1, String s2){
		//if s1 pointer == s2 pointer
		//I don't check null pointers because of the compiler don't allow null pointers 
		if(s1 == s2 )
		{
			return true ;
		}
		
			if(s1.length() != s2.length())
			{
				return false;
		
			}
		
		
		int equalSymbolCount = 0;
		for(int i = 0; i< s1.length(); i++){
	        //if corresponding symbols are equal then continue,else break loop
			if(s1.indexOf(i) == s2.indexOf(i))
			if(s1.charAt(i) == s2.charAt(i))
			{
				equalSymbolCount++;
			}
			else break;
			
		}// end of loop
		
		if(equalSymbolCount == s1.length())
		return true ;
		
		else{ 
			return false;
		}
	}//end of ifEquale()

	public static void main(String[] args) {
		
		String s1 = new String("");
		String s2 = new String("");
		
		System.out.println(ifEquale(s1,s2));

	}

}
