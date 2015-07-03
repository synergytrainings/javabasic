package main;

import java.util.ArrayList;

public class Region extends ImplementationOfBase{
	
	ArrayList<District> districtsList;
 
	public Region(int id, String name){
	 super(id, name);
    }
	
	public void setDistrictsList(ArrayList<District> districtsList){
				
		this.districtsList = districtsList;
			
	}
	
	public ArrayList<District> getDistrictsList(){
		return this.districtsList;
	}
	
	 public static int[] CalculateIndicatorValues(int indicatorsListSize,ArrayList<Region> regionsList){		
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
	

		

}
