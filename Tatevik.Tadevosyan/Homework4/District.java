package com.synisys.trainings;

public class District {
	private Integer districtID;
	private String districtName;
	private String districtCode;
	private Province parentProvince;

	public Integer getDistrictID() {
		return districtID;
	}

	public void setDistrictID(Integer districtID) {
		this.districtID = districtID;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getDistrictCode() {
		return districtCode;
	}

	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public Province getParentProvince() {
		return parentProvince;
	}

	public void setParentProvince(Province parentProvince) {
		this.parentProvince = parentProvince;
	}

}
