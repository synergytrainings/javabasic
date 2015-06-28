package com.example;

import java.awt.print.Printable;
import java.util.HashMap;

public class HomeWorkLocationWithHashMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IndicatorValue value1 = new IndicatorValue("A", 0);
		IndicatorValue value2 = new IndicatorValue("B", 1);
		
		Indicator indicator1 = new Indicator("Ind1");
		indicator1.getIndicatorValues().put("A", value1);
		indicator1.getIndicatorValues().put("B", value2);
		
		
		IndicatorValue value3 = new IndicatorValue("A", 2);
		IndicatorValue value4 = new IndicatorValue("B", 3);
		
		Indicator indicator2 = new Indicator("Ind2");
		indicator2.getIndicatorValues().put("A", value3);
		indicator2.getIndicatorValues().put("B", value4);
		
		District district1 = new District("District1");
		district1.getIndicators().put("Ind1", indicator1);
		district1.getIndicators().put("Ind2", indicator2);
		//-----
		IndicatorValue value5 = new IndicatorValue("A", 4);
		IndicatorValue value6 = new IndicatorValue("B", 5);
		IndicatorValue value7 = new IndicatorValue("C", 6);
		
		Indicator indicator3 = new Indicator("Ind3");
		indicator3.getIndicatorValues().put("A", value5);
		indicator3.getIndicatorValues().put("B", value6);
		indicator3.getIndicatorValues().put("C", value7);
		
		
		IndicatorValue value8 = new IndicatorValue("A", 7);
		IndicatorValue value9 = new IndicatorValue("B", 8);
		IndicatorValue value10 = new IndicatorValue("C", 9);
		
		
		Indicator indicator4 = new Indicator("Ind4");
		indicator4.getIndicatorValues().put("A", value8);
		indicator4.getIndicatorValues().put("B", value9);
		indicator4.getIndicatorValues().put("C", value10);
		
		District district2 = new District("District2");
		district2.getIndicators().put("Ind3", indicator3);
		district2.getIndicators().put("Ind4", indicator4);
		
		Province province1 = new Province("Province1");
		province1.getDistricts().put("District1", district1);
		province1.getDistricts().put("District2", district2);
		
		HashMap<String,Province> hashMap = new HashMap<String, Province>();
		hashMap.put("Province1", province1);

		print(hashMap);
	}
	public static void print(HashMap<String, Province> hashMap){
		for (Province province : hashMap.values()){
			System.out.println(province.getName());
			for (District district : province.getDistricts().values()){
				System.out.println("  " + district.getName());
				for (Indicator indicator : district.getIndicators().values()){
					System.out.print("    " + indicator.getName());
					for (IndicatorValue value : indicator.getIndicatorValues().values()){
						System.out.print(" " + value.getValue());
					}
					System.out.println();
				}
				System.out.print("   Total");
				for (IndicatorValue value : district.getTotalIndicator().values()){
					System.out.print(" " + value.getValue());
				}
				System.out.println();
			}
		}
	}
	
}

class Province{
	
	private String name;
	private HashMap<String, District> districts = new HashMap<String, District>();
	
	public Province(String name) {
		super();
		this.name = name;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public HashMap<String, District> getDistricts() {
		return districts;
	}
	public void setDistricts(HashMap<String, District> districts) {
		this.districts = districts;
	}
	
	
	
}
class District{

	private String name;
	private HashMap<String, Indicator> indicators= new HashMap<String, Indicator>();
	
	public District(String name) {
		super();
		this.name = name;
		
	}
	public HashMap<String, IndicatorValue> getTotalIndicator(){
		
		HashMap<String, IndicatorValue> mapindvalue = new HashMap<String, IndicatorValue>();
		for (Indicator indicator : indicators.values()) {
			for(IndicatorValue indicatorValue : indicator.getIndicatorValues().values()){
				IndicatorValue indicatorValue2= new IndicatorValue(indicatorValue.getName(), 0);
				mapindvalue.put(indicatorValue.getName(), indicatorValue2);
			}
			break;
		}
		for (Indicator indicator : indicators.values()) {
			for(IndicatorValue indicatorValue : indicator.getIndicatorValues().values()){
				
				mapindvalue.get(indicatorValue.getName()).setValue(mapindvalue.get(indicatorValue.getName()).getValue() + indicatorValue.getValue());
			}
		}
		return mapindvalue;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public HashMap<String, Indicator> getIndicators() {
		return indicators;
	}
	public void setIndicators(HashMap<String, Indicator> indicators) {
		this.indicators = indicators;
	}
	
	
	
	
}
class Indicator{
	private String name;
	private HashMap<String, IndicatorValue> indicatorValues = new HashMap<String, IndicatorValue>();
	
	public Indicator(String name) {
		super();
		this.name = name;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public HashMap<String, IndicatorValue> getIndicatorValues() {
		return indicatorValues;
	}
	public void setIndicatorValues(HashMap<String, IndicatorValue> indicatorValues) {
		this.indicatorValues = indicatorValues;
	}
	
	
}
class IndicatorValue{

private String name;
private int value;



public IndicatorValue(String name, int value) {
	super();
	
	this.name = name;
	this.value = value;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getValue() {
	return value;
}
public void setValue(int value) {
	this.value = value;
}


}