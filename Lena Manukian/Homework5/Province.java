

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lena.manukyan
 *
 */
public class Province {
	
private Integer id; //Province ID
private List<District> district; //List of Districts for every Province

public Province(Integer id){
	this.id = id;
	district = new ArrayList<District>();
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
}


public Integer totalOfIndicatorsValuesForProvince(){
	Integer sum = 0;
	for(District i:district){ 
		for(Integer value: i.getIndicators().values()){
			sum += value;
		}
	}
	return sum;
}
}
