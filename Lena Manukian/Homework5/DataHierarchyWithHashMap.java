import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import com.sun.javafx.collections.MappingChange.Map;

public class DataHierarchyWithHashMap {

	public static void main(String[] args) {
		ArrayList<Integer> indicator ;
		
	//System.out.println(indicator);
	//crate districts
    HashMap<Integer,ArrayList<Integer>> district ;
    
    
    //create provinces
    HashMap<Integer,HashMap<Integer,ArrayList<Integer>>> provinces =
    		new HashMap<Integer,HashMap<Integer,ArrayList<Integer>>>();
    
    //fill with provinces associated with district + indicator matrix
    int add = 0;
    for(int k = 0; k < 3; k++){
    	district = new HashMap<Integer,ArrayList<Integer>>();
    	for(int j = 0; j < 3; j++){
        	int size = (int) Math.random() + 4;
    		//fill indicators
        	indicator = new ArrayList<>();
        	for(int i = 0; i < size; i++){
    			indicator.add((int) (Math.random()*1000) + 4);
    		}
        	district.put(add , indicator);
        	add += indicator.get(indicator.size()-1);
        	
        }
    	provinces.put(k, district);

    }
    //output the hierarchy
    for(Integer i: provinces.keySet()){
    	
    	System.out.println("provinces "+ i );
    	for(Integer j: provinces.get(i).keySet()){
    		System.out.print("         ");
    		System.out.println("district "+ j ); 
    		System.out.print("                 ");
    		System.out.println(" indicator: " + provinces.get(i).get(j));
    	}
    }
    
	}

}
