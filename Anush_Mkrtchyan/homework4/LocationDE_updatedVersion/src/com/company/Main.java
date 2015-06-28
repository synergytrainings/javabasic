package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int index = 0;

        Indicator[] indicators = new Indicator[18];
        for (int i = 0; i < 18; i++) {
            indicators[i] = new Indicator(i);
        }

        District[] districts = new District[6];
        for (int i = 0; i < 6; i++) {
            districts[i] = new District(("District") + i);
            districts[i].addArrayOfIndicators(Arrays.copyOfRange(indicators, index, index + 3));

            index += 3;

        }

        index = 0;

        Province[] provinces = new Province[2];
        for (int i = 0; i < 2; i++) {
            provinces[i] = new Province(("Province") + i);
            provinces[i].addArrayOfDistricts(Arrays.copyOfRange(districts, index, index + 3));

            index += 3;
        }

        for (int i = 0; i < 2; i++) {
            provinces[i].Print();
        }
        System.out.print("\n" + "total ............. ");
        for (int i = 0; i < 3; i++) {
            System.out.print(provinces[0].getTotal()[i] + provinces[1].getTotal()[i] + " ");

        }
    }
}
