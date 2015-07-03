package main;

import java.util.ArrayList;

/**
 * first version of the class MainClass!!!
 * 
 * @author hasmik.khzarjyan
 *
 */
@SuppressWarnings("unchecked")
public class MainClass {
	
	static ArrayList<Region> regionsList;
	static ArrayList<Indicator> indicatorsList;	
	static ArrayList<District> districtsList;
	static int indicatorsListSize;
	static int districtsListSize;
	static int regionsListSize;
	
	static{
				
		// create indicators
		Indicator indicator1 = new Indicator(1,"Ind_1");
		Indicator indicator2 = new Indicator(2,"Ind_2");
		
		// create a list of indicators
		indicatorsList = new ArrayList<Indicator>();
		indicatorsList.add(indicator1);
		indicatorsList.add(indicator2);
		indicatorsListSize = indicatorsList.size();
			
	    // create districts, which have id, name, parent region and list of indicators		
		District district1 = new District(1,"Accc", 1, (ArrayList<Indicator>)indicatorsList.clone());					
		District district2 = new District(2,"Addd", 1,  (ArrayList<Indicator>)indicatorsList.clone());		
		District district3 = new District(3,"Beee", 2,  (ArrayList<Indicator>)indicatorsList.clone());		
		District district4 = new District(4,"Bfff", 2,  (ArrayList<Indicator>)indicatorsList.clone());
			
		
		// create  regions
		Region region1 = new Region(1,"AAA");
		Region region2 = new Region(2,"BBB");
		
		//set districtsList to region1
		ArrayList<District> districts = new ArrayList<District>();
		districts.add(district1);
		districts.add(district2);
		region1.setDistrictsList(districts);
		
		//set districtsList to region1
		districts = new ArrayList<District>();
		districts.add(district3);
		districts.add(district4);
		region2.setDistrictsList(districts);
				
		// create list of regions
		regionsList = new ArrayList<Region>();
		regionsList.add(region1);
		regionsList.add(region2);
		regionsListSize = regionsList.size();
	}
    
	
	//this method set values to district's indicators
	public static void SetValusOfIndicators(){
		int j = 10;
		for (Region currentRegion:regionsList){
			ArrayList<District> currrentDistricsList = currentRegion.getDistrictsList();	
		
		   for (District district: currrentDistricsList){
			   ArrayList<Indicator> list = new ArrayList<Indicator>();			
					
			for(int i = 0; i < district.getIndicatorsList().size(); i++){
					    
						Indicator currentIndicator = district.getIndicatorsList().get(i);
						currentIndicator = currentIndicator.clone(currentIndicator);
					    currentIndicator.setValue(j);
					    list.add(currentIndicator);
					    j += 5;			
			}
					
			district.setIndicatorsList(list);
		   }
		}					
	}
	
/*	// this method calculates total values of indicators
		public static int[] CalculateIndicatorsValues(){		
			int[] indicatorsTotal = new int[indicatorsListSize];				
			
			for (int f= 0;  f< indicatorsListSize; f++){	
				for (Region currentRegion:regionsList){
					ArrayList<District> currrentDistricsList = currentRegion.getDistrictsList();						
				    for (District district: currrentDistricsList){
					   indicatorsTotal[f] += district.getIndicatorsList().get(f).getValue();
				    }					
			    }
			}
			return indicatorsTotal;
		}
*/	
	// this method print result
	public static void PrintResult(){
	    System.out.println("Region  "  + "District   " + "Indicator1 " + "Indicator2");
	    System.out.println("- - - - - - - - - - - - - - - - - - - - -  ");
	
	    for (int i = 0; i < regionsListSize; i++){
		     
	    	 Region currentRegion = regionsList.get(i);
		     String regionName = currentRegion.getName();
		     int size = currentRegion.getDistrictsList().size();
		
		     for (int l = 0; l < size; l++ ){
			    
			    System.out.print(regionName);
			    District currentDistrict = currentRegion.getDistrictsList().get(l);
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
	    }	

	    System.out.println("- - - - - - - - - - - - - - - - - - - ");
	    System.out.print("Total               ");
	    for (int c= 0; c < indicatorsListSize; c++){
		    int[] indicatorsTotal = Calculate();
		    System.out.print(indicatorsTotal [c] + "            ");
	    }
	
	
	}
	
	public static int[] Calculate(){
		return Region.CalculateIndicatorValues(indicatorsListSize,regionsList);
	}
	
	
	public static void main(String[] args) {
		
		 SetValusOfIndicators();		
		 Calculate();
		 PrintResult();
	
	
	}

}
