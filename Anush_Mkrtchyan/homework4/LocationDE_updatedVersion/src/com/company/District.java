package com.company;

import java.util.ArrayList;

/**
 * Created by anush.mkrtchyan on 6/28/2015.
 */
public class District {
    String Name;
    ArrayList<Indicator> indicators = new ArrayList<Indicator>(3);

    public District(String name) {
        this.Name = name;
    }

    void add(Indicator indicator){
        this.indicators.add(indicator);
    }

    void addArrayOfIndicators(Indicator[] indicators) {
        int size = indicators.length;
        for(int i = 0; i < size; i++) {
            this.indicators.add(indicators[i]);
        }
    }

    public ArrayList<Indicator> getIndicators() {
        return indicators;
    }

    public void setIndicators(ArrayList<Indicator> indicators) {
        this.indicators = indicators;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }


}
