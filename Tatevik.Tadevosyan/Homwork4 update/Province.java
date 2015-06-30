package com.synisys.trainings;

import java.util.ArrayList;

public class Province {
	private String provinceName;
	private ArrayList<District> districtList = new ArrayList<District>();

	public Province(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public ArrayList<District> getDistricts() {
		return districtList;
	}

	public void setDistricts(ArrayList<District> districts) {
		this.districtList = districts;
	}

	void addDistrict(District district) {
		districtList.add(district);
	}

	void printHierarchy() {
		System.out.println(this.getProvinceName() + "\t" + "\t" + "\t"
				+ this.indicatorsTotalbyProvince());
		int lenghtDistrictsList = this.getDistricts().size();

		for (int i = 0; i < lenghtDistrictsList; i++) {
			System.out.println("\t"
					+ this.getDistricts().get(i).getDistrictName() + "\t"
					+ "\t" + this.getDistricts().get(i).indicatorsTotal());
			int lenghtIndicatorsList = this.getDistricts().get(i)
					.getIndicatorList().size();
			for (int j = 0; j < lenghtIndicatorsList; j++) {
				System.out.println("\t"
						+ "\t"
						+ this.getDistricts().get(i).getIndicatorList().get(j)
								.getIndicatorName()
						+ "    "
						+ this.getDistricts().get(i).getIndicatorList().get(j)
								.getIndicatorValue());
			}

		}

	}

	public Integer indicatorsTotalbyProvince() {
		int total = 0;
		int lenghtDistrictsList = this.getDistricts().size();
		for (int i = 0; i < lenghtDistrictsList; i++) {
			total += this.getDistricts().get(i).indicatorsTotal();

		}
		return total;

	}

}
