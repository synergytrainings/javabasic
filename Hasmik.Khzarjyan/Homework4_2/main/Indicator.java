package main;

import java.util.ArrayList;

public class Indicator extends ImplementationOfBase {
	
	private int value;
	
	
	
	public Indicator(int id, String name){
		super(id, name);
		//this.setValue(value);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

    public Indicator clone(Indicator indicator){
    	
    	int id = indicator.getId();
    	String name = indicator.getName();
    	Indicator indicatorClone = new Indicator(id,name);
    	
    	return indicatorClone;
    }
    
    
   


}
