import java.util.Arrays;
import java.util.List;

public class IndicatorValues {

	//private Integer id;
	private Integer district ;
	
	private List<Integer> values;
	
	public IndicatorValues(Integer district,  List<Integer> values){
		this.district = district;
		
		Integer[] dArray = new Integer[values.size()];
		values.toArray(dArray);
		
		this.values = Arrays.asList(Arrays.copyOf(dArray, dArray.length));
	}

	public Integer getDistrict(){
		return district;
	}
	
	public List<Integer> getValues(){
		return values;
	}
	
	public Integer countTotalValue(){
		Integer sum = 0;
		for(Integer i: values){
			sum += i;
		}
		return sum;
	}
	
}
