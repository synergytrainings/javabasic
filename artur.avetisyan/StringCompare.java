
public class StringCompare {

	public static void main(String[] args) {
		String a = new String("ffff");
		System.out.println(isEquals(a,"aaaa"));
	}
public static boolean isEquals(String a,String b){
	if(a == b) return true;
	if(a.length() != b.length()) return false;
	for (int i = 0; i < a.length(); i++) {
		if(a.charAt(i) != b.charAt(i)) return false;
	}
	return true;
}
}
