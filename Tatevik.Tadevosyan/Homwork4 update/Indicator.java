package com.synisys.trainings;

public class Indicator {

	private String indicatorName;
	private Integer indicatorValue;

	public Indicator(String indicatorName,Integer indicatorValue) {
		this.indicatorName = indicatorName;
		this.indicatorValue = indicatorValue;
	}

	public String getIndicatorName() {
		return indicatorName;
	}

	public void setIndicatorName(String indicatorName) {
		this.indicatorName = indicatorName;
	}

	public Integer getIndicatorValue() {
		return indicatorValue;
	}

	public void setIndicatorValue(Integer indicatorValue) {
		this.indicatorValue = indicatorValue;
	}

}
