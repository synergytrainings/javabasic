package test1;

public class equal {

	public static void main(String[] args) {
		
		String a="test1" ;
		String b="test1" ;
		int i =0;
		int l=a.length();
		if (a==b){System.out.println("these strings are equal");}
		else if (l==b.length()) 		
			{
			while (i <l)
				{
					if (a.charAt(i)==b.charAt(i))
						i++;
					else  
						{System.out.println("these strings are not equal"); break;}	 
				}
			
			 if (i==l) System.out.println("these strings are equal");
			 	}

	}

}
