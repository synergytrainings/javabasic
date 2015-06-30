package com.synisys.trainings;

public class Test {

	public static void main(String[] args) {

		Indicator indicator1 = new Indicator("indicator1", 10);
		Indicator indicator2 = new Indicator("indicator2", 20);
		Indicator indicator3 = new Indicator("indicator3", 30);
		Indicator indicator4 = new Indicator("indicator4", 40);
		Indicator indicator5 = new Indicator("indicator5", 50);
		Indicator indicator6 = new Indicator("indicator6", 60);
		Indicator indicator7 = new Indicator("indicator7", 70);
		Indicator indicator8 = new Indicator("indicator8", 80);
		Indicator indicator9 = new Indicator("indicator9", 90);
		Indicator indicator10 = new Indicator("indicator10", 100);
		District district1 = new District("district1");
		District district2 = new District("district2");
		District district3 = new District("district3");
		District district4 = new District("district4");
		District district5 = new District("district5");

		district1.addIndicator(indicator1);

		district1.addIndicator(indicator2);
		district2.addIndicator(indicator3);
		district2.addIndicator(indicator4);
		district3.addIndicator(indicator5);
		district3.addIndicator(indicator6);
		district4.addIndicator(indicator7);
		district4.addIndicator(indicator8);
		district5.addIndicator(indicator9);
		district5.addIndicator(indicator10);

		Province province1 = new Province("Province1");
		Province province2 = new Province("Province2");
		province1.addDistrict(district1);
		province1.addDistrict(district2);
		province2.addDistrict(district3);
		province2.addDistrict(district4);
		province2.addDistrict(district5);

		province1.printHierarchy();
		province2.printHierarchy();

	}
}
