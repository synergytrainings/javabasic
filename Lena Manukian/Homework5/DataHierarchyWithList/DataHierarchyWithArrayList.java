import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataHierarchyWithArrayList {

	private List<Province> provinces;
	private List<District> districts;
	private List<IndicatorValues> indicatorValues;
	Random rand = new Random();

	DataHierarchyWithArrayList() {
		provinces = new ArrayList<>();
		districts = new ArrayList<>();
		indicatorValues = new ArrayList<>();
	}

	public void fillData() {
		// create provinces
		provinces.add(new Province(1));
		provinces.add(new Province(2));

		// create districts
		districts.add(new District(11, 1));
		districts.add(new District(22, 2));
		districts.add(new District(21, 2));
		districts.add(new District(12, 1));

		int districtLen = districts.size();
		// indicator values
		List<Integer> values = new ArrayList<>();

		for (int d = 0; d < districtLen; d++) {

			for (int i = 0; i < 3; i++) {
				values.add(rand.nextInt(100));
			}
			indicatorValues.add(new IndicatorValues(districts.get(d).getId(), values));
			values.clear();
		}
	}

	public void printDataHierarchy() {
		for (Province p : provinces) {
			// print province
			System.out.println("Province: " + p.getId());
			for (District d : districts) {
				if (d.getParentId() == p.getId()) {
					System.out.print("       ");
					System.out.println("District: " + d.getId());
					for (IndicatorValues i : indicatorValues) {
						if (i.getDistrict() == d.getId()) {
							System.out.print("                  ");
							System.out.println("IndicatorValues: " + i.getValues());
						}
					}
				}
			}

		}
	}

	public static void main(String[] args) {

		DataHierarchyWithArrayList data = new DataHierarchyWithArrayList();

		data.fillData();
		data.printDataHierarchy();

	}

}
