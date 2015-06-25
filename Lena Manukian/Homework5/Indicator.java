
import java.util.Map;
import java.util.TreeMap;

public class Indicator {
private Integer id;
//Map<District,Integer> districtValues;//every entity is an <District, Value> pair

public Indicator(Integer id){
	this.id = id;
	//districtValues = new TreeMap<District,Integer>();
}


public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

/*
public Map<District, Integer> getIndicatorValues() {
	return districtValues;
}

public void putDistrictValues(District key, Integer value ) {
	this.districtValues.put(key, value) ;
}



public Integer totalOfIndicatorsValues(){
	int sum = 0;
	for(Integer l : districtValues.values()){
		sum += l;
	}
	return sum;
}
*/
}
