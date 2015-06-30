package com.synisys.trainings;

import java.util.ArrayList;

public class District {
	private String districtName;
	private ArrayList<Indicator> indicatorList = new ArrayList<Indicator>();

	public District(String districtName) {
		this.districtName = districtName;

	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public ArrayList<Indicator> getIndicatorList() {
		return indicatorList;
	}

	public void setIndicatorList(ArrayList<Indicator> indicatorList) {
		this.indicatorList = indicatorList;
	}

	public void addIndicator(Indicator indicator) {
		indicatorList.add(indicator);
	}

	public Integer indicatorsTotal() {
		int total = 0;
		int lenghtIndicatorsList = this.getIndicatorList().size();
		for (int i = 0; i < lenghtIndicatorsList; i++) {
			total += this.getIndicatorList().get(i).getIndicatorValue();

		}
		return total;

	}

}
