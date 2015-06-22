


import java.util.HashMap;
import java.util.Map;

public class Indicator {
private Integer id;
Map<District,Integer> DistrictValues;//every entity is an <District, Value> pair

public Indicator(Integer id){
	this.id = id;
	DistrictValues = new HashMap<District,Integer>();
}


public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public Map<District, Integer> getIndicatorValues() {
	return DistrictValues;
}

public void putDistrictValues(District key, Integer value ) {
	this.DistrictValues.put(key, value) ;
}

/**
 * 
 * @return sum of values of an Indicator 
 */
public Integer totalOfIndicatorsValues(){
	int sum = 0;
	for(Integer l:DistrictValues.values()){
		sum += l;
	}
	return sum;
}
}
