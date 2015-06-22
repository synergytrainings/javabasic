

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Random;

public class Main {

	List<Province> provinces;
	List<District> districts;
	List<Indicator> indicators;
	Random rand = new Random();
	
	public void fillData(){
		provinces = new ArrayList<Province>();
		districts =  new ArrayList<District>();
		indicators =  new ArrayList<Indicator>();
		
		
			//fill indicator's list
		for(int i = 0; i<= rand.nextInt(20);i++){
		  indicators.add(new Indicator(i));
	    }
		
		Province currentProvince;
		//fill Province list (only ids)
		for(int p = 0; p <= rand.nextInt(15); p++){
			currentProvince = new Province(p);
			provinces.add(currentProvince);
			
			District currentDistrict ;
			Integer indValue;
			//fill district list (only ids)
			for(int d = 0; d <= rand.nextInt(20); d++){
				currentDistrict = new District(rand.nextInt(400));
				//put <Indicator,Value> pair into currentDistrict for all indicators
				for(Indicator ind:indicators){
					indValue =  rand.nextInt(100);
					currentDistrict.putIndicatorValue(ind,indValue);
					ind.putDistrictValues(currentDistrict,indValue);
				}
				districts.add(currentDistrict);	
			}
			
			//add District list into currentProvince entity
			currentProvince.setDistrict(districts);
			districts.clear(); //clear list for new adding for next province
		}
	}
	
	
	public void print(){
		
		for(Province p:provinces){
			System.out.println("ProvinceID: " + p.getId() );
			for(District d:p.getDistrict()){
				System.out.println("    DistrictID: "+ d.getId());
				System.out.print("                 <Indicator,Value>: ");
				for(Map.Entry<Indicator, Integer> i: d.getIndicators().entrySet()){
					System.out.print("<"+ i.getKey().getId() + ","+ i.getValue() + ">, ");
				}
				System.out.println();
			}
		}
	}
	
	public void printIndicatorsTotal(){
		System.out.print("<Indicator,TotalValue>: ");
		for(Indicator i:indicators){
			System.out.print("<Indicator-"+ i.getId() + ", total-"+ i.totalOfIndicatorsValues() +">, ");
		}
	}
	
	public static void main(String[] args){
		Main m = new Main();
		
		m.fillData();
		m.print();
		System.out.println();
		System.out.println("----------------------------");
		m.printIndicatorsTotal();
		System.out.println();
		System.out.println();
		System.out.println();
	}
}
