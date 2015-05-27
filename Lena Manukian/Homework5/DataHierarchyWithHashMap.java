import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataHierarchyWithHashMap {

	public static void main(String[] args) {
		List<Integer> indicator;

		// System.out.println(indicator);
		// crate districts
		Map<Integer, List<Integer>> district;

		// create provinces
		Map<Integer, Map<Integer, List<Integer>>> provinces = new HashMap<Integer, Map<Integer, List<Integer>>>();

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
		// output the hierarchy
		/*
		for (Integer i : provinces.keySet()) {

			System.out.println("provinces " + i);
			for (Integer j : provinces.get(i).keySet()) {
				System.out.print("         ");
				System.out.println("district " + j);
				System.out.print("                 ");
				System.out.println(" indicator: " + provinces.get(i).get(j));
			}
		}
*/
		for(Map.Entry<Integer, Map<Integer,List<Integer>>> e: provinces.entrySet()){
			System.out.println("provinces " + e.getKey());
			for(Map.Entry<Integer, List<Integer>> k: e.getValue().entrySet()){
				System.out.print("         ");
				System.out.println("district " + k.getKey());
				System.out.print("                 ");
				System.out.println(" indicator: " + k.getValue());
			}
		}
	}

}
