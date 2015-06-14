package com.example;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class HomeWorkLocation {
	


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Indicator indicator1 = new Indicator(1, 2, 3);
		Indicator indicator2 = new Indicator(4, 5, 6);
		Indicator indicator3 = new Indicator(7, 8, 9);
		Indicator indicator4 = new Indicator(10, 11, 12);
		Indicator indicator5 = new Indicator(13, 14, 15);
		Indicator indicator6 = new Indicator(16, 17, 18);
		Indicator indicator7 = new Indicator(19, 20, 21);
		Indicator indicator8 = new Indicator(22, 23, 24);
		
		District district1 = new District("District1");
		district1.getIndicators().add(indicator1);
		district1.getIndicators().add(indicator2);
		
		District district2 = new District("District2");
		district2.getIndicators().add(indicator3);
		district2.getIndicators().add(indicator4);
		
		District district3 = new District("District3");
		district3.getIndicators().add(indicator5);
		district3.getIndicators().add(indicator6);
		
		District district4 = new District("District4");
		district4.getIndicators().add(indicator7);
		district4.getIndicators().add(indicator8);
		
		Province province1 = new Province("Province1");
		province1.getDiList().add(district1);
		province1.getDiList().add(district2);
		
		Province province2 = new Province("Province2");
		province2.getDiList().add(district3);
		province2.getDiList().add(district4);
		
      
		Location location1 = new Location("Location1");
		location1.getPoList().add(province1);
		location1.getPoList().add(province2);
		List<Location> list = new ArrayList<Location>();
		list.add(location1);
		PrintWithTotal(list);
	}
public static void Print(List<Location> list) {
	for (Location location : list) {
		System.out.println(location.getName());
		for (Province province : location.getPoList()) {
			System.out.println("  " + province.getName());
			for (District district : province.getDiList()) {
				System.out.println("    " + district.getName());
				System.out.println("      Ind1  Ind2  Ind3");
				for (Indicator indicator : district.getIndicators()) {
					
					System.out.println("      " + indicator.getInd1() + "    " + indicator.getInd2() + "    " + indicator.getInd3());
				}
			}
		}
	}

	}
public static void PrintWithTotal(List<Location> list) {
	for (Location location : list) {
		System.out.println(location.getName());
		for (Province province : location.getPoList()) {
			System.out.println("  " + province.getName());
			for (District district : province.getDiList()) {
				System.out.println("    " + district.getName());
				System.out.println("      Ind1  Ind2  Ind3");
				for (Indicator indicator : district.getIndicators()) {
					
					System.out.println("      " + indicator.getInd1() + "    " + indicator.getInd2() + "    " + indicator.getInd3());
				}
				System.out.println("      ----------------");
				System.out.println("      " + district.getIdicatorTotal().getInd1() + "    " + district.getIdicatorTotal().getInd2() + "    " + district.getIdicatorTotal().getInd3());
			}
		}
	}

	}
}
class Location{
	private String name;
	private List<Province> poList = new ArrayList<Province>();
	public Location(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Province> getPoList() {
		return poList;
	}
	public void setPoList(List<Province> poList) {
		this.poList = poList;
	}
	
	
}
class Province{
	private String name;
	private List<District> diList = new ArrayList<District>();
    public Province(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<District> getDiList() {
		return diList;
	}
	public void setDiList(List<District> diList) {
		this.diList = diList;
	}
	
    
}
class District{
	private String name;
	private  List<Indicator> indicators = new ArrayList<Indicator>();
	
	
	public District(String name) {
		this.name = name;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Indicator> getIndicators() {
		return indicators;
	}
	public void setIndicators(List<Indicator> indicators) {
		this.indicators = indicators;
	}
	public Indicator getIdicatorTotal() {
		int s1 = 0, s2 = 0, s3 = 0;
		
		for (Indicator indicator : indicators) {
			s1 += indicator.getInd1();
			s2 += indicator.getInd2();
			s3 += indicator.getInd3();
		}
		Indicator indicator = new Indicator(s1, s2, s3);
		return indicator;
	}
}
class Indicator{
 private int ind1;
 private int ind2;
 private int ind3;
public Indicator(int ind1, int ind2, int ind3) {
	super();
	this.ind1 = ind1;
	this.ind2 = ind2;
	this.ind3 = ind3;
}
public int getInd1() {
	return ind1;
}
public void setInd1(int ind1) {
	this.ind1 = ind1;
}
public int getInd2() {
	return ind2;
}
public void setInd2(int ind2) {
	this.ind2 = ind2;
}
public int getInd3() {
	return ind3;
}
public void setInd3(int ind3) {
	this.ind3 = ind3;
}
 
}