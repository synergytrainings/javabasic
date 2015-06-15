package main;

import java.util.ArrayList;

/**
 * first version of the class MainClass!!!
 * 
 * @author hasmik.khzarjyan
 *
 */
public class MainClass {
    
	
	
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws CloneNotSupportedException {
		
		// create  regions
		Region region1 = new Region(1,"AAA");
		Region region2 = new Region(2,"BBB");
		
		// create list of regions
		ArrayList<Region> regionsList = new ArrayList<Region>();
		regionsList.add(region1);
		regionsList.add(region2);
				
		// create indicators
		Indicator indicator1 = new Indicator(1,"Ind_1");
		Indicator indicator2 = new Indicator(2,"Ind_2");
		
		// create a list of indicators
		ArrayList<Indicator> indicatorsList = new ArrayList<Indicator>();
		indicatorsList.add(indicator1);
		indicatorsList.add(indicator2);
		int indicatorsListSize = indicatorsList.size();
		
	
	    // create districts, wich have id, name, parent region and list of indicators		
		District district1 = new District(1,"Accc", 1, (ArrayList<Indicator>)indicatorsList.clone());					
		District district2 = new District(2,"Addd", 1,  (ArrayList<Indicator>)indicatorsList.clone());		
		District district3 = new District(3,"Beee", 2,  (ArrayList<Indicator>)indicatorsList.clone());		
		District district4 = new District(4,"Bfff", 2,  (ArrayList<Indicator>)indicatorsList.clone());
		
		// create district's list
		ArrayList<District> districtsList = new ArrayList<District>();
		districtsList.add(district1);
		districtsList.add(district2);
		districtsList.add(district3);
		districtsList.add(district4);		
		int districtsListSize = districtsList.size();
		
		
			
        // set valus to district's indicators
		int j = 5;
		for (District district: districtsList){
			ArrayList<Indicator> list = new ArrayList<>();			
			
			for(int i = 0; i < district.getIndicatorsList().size(); i++){
			    
				Indicator currentIndicator = district.getIndicatorsList().get(i);
				currentIndicator = currentIndicator.clone(currentIndicator);
			    currentIndicator.setValue(j);
			    list.add(currentIndicator);
			    j += 5;			
			}
			
			district.setIndicatorsList(list);
		}
		
		
		// array for total valus of indicators
		int[] indicatorsTotal = new int[indicatorsList.size()];				
		for (int f= 0;  f< indicatorsList.size(); f++){
		
		    for (District district: districtsList){
		    	indicatorsTotal[f] += district.getIndicatorsList().get(f).getValue();
			}
			
		}
		
		
		// print result
		System.out.println("Region  "  + "District   " + "Indicator1 " + "Indicator2");
		System.out.println("- - - - - - - - - - - - - - - - - - - - -  ");
		for (int i = 0; i < districtsListSize; i++ ){
			District currentDistrict = districtsList.get(i);
			
			 // find parent region and print
			 int parent = currentDistrict.getParentId();
			 int t;
			 for (t = 0; t < regionsList.size(); t++){
				 if( parent == regionsList.get(t).getId()){					 
					 System.out.print(regionsList.get(t).getName());
					 break;					 							 
				 }
			 }
			 
			 System.out.print("     ");
			 System.out.print(currentDistrict.getName());
			 System.out.print("        ");
			 
			 for (int r= 0; r < indicatorsListSize; r++){
				System.out.print (currentDistrict.getIndicatorsList().get(r).getValue());
				System.out.print("            ");
			 }
			 			 
			 System.out.println();
			 System.out.println();
			 
			
		}		
		
		System.out.println("- - - - - - - - - - - - - - - - - - - ");
		System.out.print("Total               ");
		for (int c= 0; c < indicatorsListSize; c++){
			System.out.print(indicatorsTotal[c] + "            ");
		}
		
	}

}
