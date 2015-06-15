package main;

import java.util.ArrayList;

public class District extends ImplementationOfBase {
	
	private int parentId;
	
	ArrayList<Indicator> indicatorsList = new ArrayList<Indicator>();
	
	
	public District(int id, String name, int parentId, ArrayList<Indicator> list){
		super(id, name);
		this.parentId = parentId;
		this.indicatorsList = list;
		
	}
	
	public int getParentId() {
		return parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	
	public ArrayList<Indicator> getIndicatorsList() {
		return indicatorsList;
	}

	public void setIndicatorsList(ArrayList<Indicator> list) {
		this.indicatorsList = list;
	}
	
	
	

	
}
