
import java.util.Map;
import java.util.TreeMap;

public class District implements Comparable<District>{
private Integer id;//District ID
private Map<Integer, Integer> indicatorValues;//every entity is an <Indicator,Value> pair

public District(Integer id){
	this.id = id;
	indicatorValues = new TreeMap<Integer, Integer>();
}

public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public  Map<Integer, Integer> getIndicators() {
	return indicatorValues;
}
/**
 * adds <Indicator,value> pair to indicatorValues
 * @param key is an Indicator
 * @param value is a Value
 */
public void putIndicatorValue( Integer key, Integer value) {
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


public int compareTo(District d){
	if(this.id == d.id)
	return 0;
	
	if(this.id < d.id)
		return -1;
	
	return 1;
}
}
