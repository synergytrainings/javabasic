package com.synisys.trainings;

import java.util.ArrayList;

public class Village {
	private Integer villageID;
	private String villageName;
	private String villageCode;
	private District parentDistrict;
	private ArrayList<Indicator> indicators;

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

	public ArrayList<Indicator> getIndicators() {
		return indicators;
	}

	public void addIndicators(Indicator ind) {
		indicators.add(ind);
	}

}
