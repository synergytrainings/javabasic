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
		

}
