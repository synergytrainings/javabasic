import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataHierarchyWithHashMap {
	
	private List<Integer> indicator;
	private Map<Integer, List<Integer>> district;
	private Map<Integer, Map<Integer, List<Integer>>> provinces;
	
	/**
	 * setData() method fills provinces, districts and indicator's expected data with random values
	 */
	public  void  setData(){
		// create provinces
		provinces = new HashMap<Integer, Map<Integer, List<Integer>>>();
		
		// fill provinces associated with district + indicator matrix
				int addToIndex = 0;
				for (int k = 0; k < 3; k++) {
					district = new HashMap<Integer, List<Integer>>();
					for (int j = 0; j < 3; j++) {
						int size = (int) Math.random() + 4;
						// fill indicators
						indicator = new ArrayList<>();
						for (int i = 0; i < size; i++) {
							indicator.add((int) (Math.random() * 1000) + 4);
						}
						// fill districts
						district.put(addToIndex, indicator);
						addToIndex += indicator.get(indicator.size() - 1);

					}
					// fill provinces
					provinces.put(k, district);

				}
		
	}
	/**
	 * printSpecificDistricIndicatorValues(Integer id) method prints
	 *  province->district->indicator's values for specific district
	 * @param districID
	 */

	public void printSpecificDistricIndicatorValues(Integer districID){
		
		for(Map.Entry<Integer, Map<Integer,List<Integer>>> e: provinces.entrySet()){
			//System.out.println("provinces " + e.getKey());
			for(Map.Entry<Integer, List<Integer>> k: e.getValue().entrySet()){
				//System.out.print("         ");
				if( k.getKey() == districID ){
					System.out.println("provinces " + e.getKey());
					System.out.print("         ");
				    System.out.println("district " + k.getKey());
				    System.out.print("                 ");
				    System.out.println(" indicator's values: " + k.getValue());
			   }
			}
		}
	}
	
	/**
	 * printDataHierarchy() method prints province->district->indicator's values all data
	 */
	public void printDataHierarchy(){
		for(Map.Entry<Integer, Map<Integer,List<Integer>>> e: provinces.entrySet()){
			System.out.println("provinces " + e.getKey());
			for(Map.Entry<Integer, List<Integer>> k: e.getValue().entrySet()){
				System.out.print("         ");
				System.out.println("district " + k.getKey());
				System.out.print("                 ");
				System.out.println(" indicator's values: " + k.getValue());
			}
		}
	}
	
	public void printTotalValueOfIndicators(){
		for(Map.Entry<Integer, Map<Integer,List<Integer>>> e: provinces.entrySet()){
			System.out.println("provinces " + e.getKey());
			for(Map.Entry<Integer, List<Integer>> k: e.getValue().entrySet()){
				System.out.print("         ");
				System.out.println("district " + k.getKey());
				System.out.print("                 ");
				System.out.print(" indicator's total: ");
				//count the total of indicator's values
				List<Integer> list = k.getValue();
				int sum = 0;
				for(Integer i: list){
					sum += i;
				}
				
				System.out.println(sum);
			}
		}
	}
	
	public static void main(String[] args) {
		
		DataHierarchyWithHashMap data = new DataHierarchyWithHashMap();
		
		data.setData();
		//data.printDataHierarchy();
		
		//data.printTotalValueOfIndicators();
		data.printSpecificDistricIndicatorValues(0);
		
	}

}
