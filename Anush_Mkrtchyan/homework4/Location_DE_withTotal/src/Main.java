public class Main {

    public static void main(String[] args) {
        Province province1 = new Province("Province1");
        District district1_1 = new District("District1_1", province1);
        District district1_2 = new District("District1_2", province1);
        District district1_3 = new District("District1_3", province1);

        Indicator indicator1 = new Indicator(1, district1_1);
        Indicator indicator2 = new Indicator(2, district1_1);

        Indicator indicator3 = new Indicator(3, district1_2);
        Indicator indicator4 = new Indicator(4, district1_2);

        Indicator indicator5 = new Indicator(5, district1_3);
        Indicator indicator6 = new Indicator(6, district1_3);

        System.out.println(province1.getName());
        for (int i = 0; i < province1.getDistricts().size(); i++) {
            System.out.print("    " + province1.getDistricts().get(i).getName() + " ..... ");
            for (int j = 0; j < province1.getDistricts().get(i).getIndicators().size(); j++)
                System.out.print(province1.getDistricts().get(i).getIndicators().get(j).getID() + "   ");
            System.out.println("");
        }
        System.out.print("\n" + "total                 ");


       District.Pair pair = district1_1.IndicatorPair();

        for (int i = 0; i < pair.getPair().length; i++)
            System.out.print(pair.pair[i] + "  ");

    }
}




