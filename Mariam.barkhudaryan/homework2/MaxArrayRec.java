package tt;

class MaxArrayRec {
	
	  public static void main(String[] args)
	  {
		int a[] = new int[] {10, 11, -2088, 2, 12, 120};	    
	    int max = Max(a, a.length);
	    System.out.println("Max valiue is: " + max);
	  }
	 
	  static int Max(int[] a, int length)
	  {
	    if (length == 1)
	      return a[0];
	    return max(Max(a, length - 1), a[length - 1]);
	  }
	 
	  private static int max(int start, int second)
	  {
	    return start > second ? start : second;
	  }	
	}

	