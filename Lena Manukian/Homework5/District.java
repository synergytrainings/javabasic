package adequat;

import java.util.HashMap;
import java.util.Map;

public class District {
private Integer id;//District ID
private Map<Indicator, Integer> indicatorValues;//every entity is an <Indicator,Value> pair

public District(Integer id){
	this.id = id;
	indicatorValues = new HashMap<Indicator, Integer>();
}

public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public  Map<Indicator, Integer> getIndicators() {
	return indicatorValues;
}
/**
 * adds <Indicator,value> pair to indicatorValues
 * @param key is an Indicator
 * @param value is a Value
 */
public void putIndicatorValue( Indicator key, Integer value) {
	this.indicatorValues.put(key,value);
}

public Integer totalOfIndicatorsValuesForDistrict(){
	Integer sum = 0;
	for(Integer i:indicatorValues.values()){
		sum += i;
	}
	return sum;
}

public Object clone(){
	District d = new District(this.id);
	return d;
}
}
