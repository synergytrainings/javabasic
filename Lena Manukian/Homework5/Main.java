
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Random;
import java.util.TreeMap;

public class Main {

	private List<Province> provinces;
	private List<District> districts;
	private List<Indicator> indicators;
	private Map<Integer,Integer> indicatorTotal;
	Random rand = new Random();
	
	public void fillData(){
		provinces = new ArrayList<Province>();
		districts =  new ArrayList<District>();
		indicators =  new ArrayList<Indicator>();
		indicatorTotal = new TreeMap<>();
		
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
			Integer value;
			//fill district list (only ids)
			for(int d = 0; d <= rand.nextInt(20); d++){
				currentDistrict = new District(rand.nextInt(400));
				//put <Indicator,Value> pair into currentDistrict for all indicators
				for(Indicator ind:indicators){
					value =  rand.nextInt(100);
					currentDistrict.putIndicatorValue(ind.getId(),value);
					//ind.putDistrictValues(currentDistrict,indValue);
				}
				districts.add(currentDistrict);	
			}
			
			//add District list into currentProvince entity
			currentProvince.setDistrict(districts);
			currentProvince.totalOfIndicatorsValuesByProvince();
			districts.clear(); //clear list for new adding for next province
		}
	}
	
	
	public void print(){
		
		for(Province p:provinces){
			System.out.println("ProvinceID: " + p.getId() );
			for(District d:p.getDistrict()){
				System.out.println("    DistrictID: "+ d.getId());
				System.out.print("                 <Indicator,Value>: ");
				for(Map.Entry<Integer, Integer> i: d.getIndicators().entrySet()){
					System.out.print("<"+ i.getKey() + ","+ i.getValue() + ">, ");
				}
				System.out.println();
			}
		}
	}
	
	public void printIndicatorsTotal(){
		 totalIndictorValues();
		System.out.print("<Indicator,TotalValue>: ");
		
			System.out.print(indicatorTotal);
		
	}
	
	public void totalIndictorValues()
	{   
		Integer sum = 0;
		for(Indicator i:indicators){
			for(Province p : provinces){
				sum += p.getIndicatorsTotal().get(i.getId());
			}
			indicatorTotal.put(i.getId(), sum);
			sum = 0; //reset sum
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
