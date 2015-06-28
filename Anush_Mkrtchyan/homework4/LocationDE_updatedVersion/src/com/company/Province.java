package com.company;

import java.util.ArrayList;

/**
 * Created by anush.mkrtchyan on 6/28/2015.
 */
public class Province {
    String Name;
    ArrayList<District> districts = new ArrayList<District>();
    int[] total = new int[3];

    void add(District district) {
        this.districts.add(district);
    }

    void addArrayOfDistricts(District[] districts) {
        int size = districts.length;
        for(int i = 0; i < size; i++) {
            this.districts.add(districts[i]);
        }
    }

    public Province(String name) {
        Name = name;
    }

    int[] CalculateTotalInProvinceLevel(){
        int sizeDistrict = this.getDistricts().size();
        for (int k = 0; k < 3; k++)
            for (int i = 0; i < sizeDistrict; i++)
                total[k] += this.getDistricts().get(i).getIndicators().get(k).value;
        return total;
    }

    void Print() {
        int sizeDistrict = this.getDistricts().size();
        System.out.println(this.getName());
        for (int i = 0; i < sizeDistrict; i++) {
            System.out.print("    " + this.getDistricts().get(i).getName() + " ..... ");
            for (int j = 0; j < 3; j++)
                System.out.print(this.getDistricts().get(i).getIndicators().get(j).getValue() + "   ");
            System.out.println("");
        }

    }

    void PrintWithTotal() {
        int sizeDistrict = this.getDistricts().size();
        System.out.println(this.getName());
        for (int i = 0; i < sizeDistrict; i++) {
            System.out.print("    " + this.getDistricts().get(i).getName() + " ..... ");
            for (int j = 0; j < 3; j++)
                System.out.print(this.getDistricts().get(i).getIndicators().get(j).getValue() + "   ");
            System.out.println("");
        }
        System.out.print("\n" + "total ............... ");
        for (int i = 0; i < 3; i++)
            System.out.print(total[i] + "  ");
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public ArrayList<District> getDistricts() {
        return districts;
    }

    public void setDistricts(ArrayList<District> districts) {
        this.districts = districts;
    }

    public int[] getTotal() {
        return CalculateTotalInProvinceLevel();
    }

    public void setTotal(int[] total) {
        this.total = total;
    }
}
