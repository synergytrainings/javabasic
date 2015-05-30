package com.synisys.trainings;

import java.util.Map;

public class Village {
	private Integer villageID;
	private String villageName;
	private String villageCode;
	private District parentDistrict;
	private Map<Integer, String> indicators;

	public Integer getVillageID() {
		return villageID;
	}

	public void setVillageID(Integer villageID) {
		this.villageID = villageID;
	}

	public String getVillageName() {
		return villageName;
	}

	public void setVillageName(String villageName) {
		this.villageName = villageName;
	}

	public String getVillageCode() {
		return villageCode;
	}

	public void setVillageCode(String villageCode) {
		this.villageCode = villageCode;
	}

	public District getParentDistrict() {
		return parentDistrict;
	}

	public void setParentDistrict(District parentDistrict) {
		this.parentDistrict = parentDistrict;
	}

	public Map<Integer, String> getIndicators() {
		return indicators;
	}

	public void addIndicators(Integer key, String value) {
		indicators.put(key, value);
	}

}
