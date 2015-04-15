
public class String_Test {
	public static void main(String[] args) 
	{
		String a, b;
		a = "aaa";
		b = "aaaggggggggg";
		System.out.print(IsEqual(a, b));
	}
	
	public static  boolean IsEqual(String s1, String s2)
	{
		if (s1 == s2)
			return true;
		else
		{
			if (s1.length() != s2.length())
				return false;
			else
				for (int i = 0; i < s1.length(); i++)
					if (s1.charAt(i) != s2.charAt(i))
						return false;					
				return true;
		}
	}

}
}
