import java.util.ArrayList;

/**
 * Created by anush.mkrtchyan on 6/21/2015.
 */
public class District {
    String name;
    Province province;
    ArrayList<Indicator> indicators = new ArrayList<Indicator>(2);


    District(String name, Province province) {
        this.name = name;
        this.province = province;
        province.getDistricts().add(this);

    }

    public class Pair {
        int pair[];

        public Pair(int[] pair) {
            this.pair = pair;
        }

        public int[] getPair() {
            return pair;
        }

        public void setPair(int[] pair) {
            this.pair = pair;
        }
    }

    public Pair IndicatorPair() {
        int pair[] = new int[2];
        for (int m = 0; m < pair.length; m++)
            pair[m] = 0;

        for (int k = 0; k < this.getIndicators().size(); k++)
            for (int i = 0; i < this.getProvince().getDistricts().size(); i++)
                pair[k] += this.getProvince().getDistricts().get(i).getIndicators().get(k).ID;
        return new Pair(pair);

    }

    public ArrayList<Indicator> getIndicators() {
        return indicators;
    }

    public void setIndicators(ArrayList<Indicator> indicators) {
        this.indicators = indicators;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }
}
