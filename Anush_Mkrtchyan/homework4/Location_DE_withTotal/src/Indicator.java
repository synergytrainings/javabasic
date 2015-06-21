/**
 * Created by anush.mkrtchyan on 6/21/2015.
 */
public class Indicator {
    int ID;
    District district;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    public Indicator(int ID, District district) {
        this.ID = ID;
        this.district = district;
        district.getIndicators().add(this);

    }


}
