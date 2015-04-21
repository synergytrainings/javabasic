package tt;

public class MatrixMultiplication {

	public static void main(String[] args) {
				
		int[][] a = { {1, 2},  {3, 4}, {5, 6} };
		int[][] b = { {1, 2},  {3, 4}};
		
		
		 int aRows = a.length;
	        int aColumns = a[0].length;
	        int bRows = b.length;
	        int bColumns = b[0].length;
	        
	        int[][] c = new int[aRows][bColumns];
	        int s = 0 ;
	        
	        if ( aColumns != bRows ) { System.out.println( "error: matrix rows and columns are not same" );}
	        else 
	        {
	        	  for (int i = 0 ; i < aRows ; i++ )
	        	  {
	        		  for (int j = 0 ; j < bColumns ; j++ )
	        		  {
	        			  for (int l = 0 ; l < bRows ; l++ )
	        			  {
	        				  s = s + a[i][l] * b[l][j];
	        			  }
	        			  c[i][j] = s;
	        			  s = 0;
	        		  }	        		  
	        	  }
	        	
	        	  for ( int i = 0 ; i < aRows ; i++ )
			         {
			            for (int  j = 0 ; j < bColumns ; j++ )
			               System.out.print(c[i][j] + "\t");			 
			               System.out.print("\n");
			         }
	        }
	        	  
	        }		
		
	}


