

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author lena.manukyan
 *
 */
public class Province {

private Integer id; //Province ID
private List<District> district; //List of Districts for every Province
private Map<Integer,Integer> indicatorsTotal;

public Province(Integer id){
	this.id = id;
	district = new ArrayList<District>();
	indicatorsTotal = new TreeMap<>();
}

public Map<Integer,Integer> getIndicatorsTotal(){
	return indicatorsTotal;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public List<District> getDistrict() {
	return district;
}

public void setDistrict(List<District> district) {

	this.district.addAll(district);
	District anyDistrict = district.get(0);
	for(Map.Entry<Integer, Integer> i: anyDistrict.getIndicators().entrySet()){
		indicatorsTotal.put(i.getKey(), 0);
	}
}


public void totalOfIndicatorsValuesByProvince(){
	Integer sum = 0;
	for(Map.Entry<Integer,Integer> currentTotal : indicatorsTotal.entrySet()){
    
  //count total amount of every Indicator
	for(District d : district){
		sum += d.getIndicators().get(currentTotal.getKey());
	}
	//The set is backed by the map, so changes to the map are reflected in the set, and vice-versa. 
	currentTotal.setValue(sum);
	//reset sum
	sum = 0;
  }
 }
}
