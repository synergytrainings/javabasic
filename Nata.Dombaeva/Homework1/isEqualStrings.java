package javaHomework;
import java.util.*;

public class isEqualStrings 

{ public static void main(String[] args) 
   {
	//this method should be check 2 string for equality
	
	Scanner in = new Scanner(System.in);
    System.out.println("Input first string, please");
    String firstString = in.nextLine();
    
    
    System.out.println("Input second string, please");
    String secondString = in.nextLine();
   
    int result = firstString.compareTo(secondString);
    if (result != 0)
    		System.out.print("First string not equal to second string");
    else    System.out.print("First string equal to second string");
    
    in.close(); 
   }		

}
