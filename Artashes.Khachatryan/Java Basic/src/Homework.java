public class Homework {

	public static void main(String[] args)
	{
		
		String A = "abc";
		String B = "abe";
		System.out.print(isEqual(A,B));

	}
	
	static boolean isEqual (String A, String B){
		
		if(A.length() != B.length())
			return false;
		else{
		for(int i=0; i<A.length(); i++)
			{
				if (A.charAt(i) != B.charAt(i))
					return false;
			};
		return true;
		}
	}
	static int[] SortArray(int[] a){
			 for (int i = 0; i < a.length; i++)
			    {
			        int minindex = i;
			        for (int j = i + 1; j < a.length; j++)
			        {
			            if (a[j] < a[minindex])
			            {
			                minindex = j;
			            }
			        }
			        int b = a[i];
			        a[i] = a[minindex];
			        a[minindex] = b;
			    }
 		
		return a;
	}
}
