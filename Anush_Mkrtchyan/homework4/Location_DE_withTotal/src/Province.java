
import java.util.ArrayList;
/**
 * Created by anush.mkrtchyan on 6/21/2015.
 */
public class Province {
    String name;
    ArrayList<District> districts = new ArrayList<District>(3);

    public Province(String name) {
        switch (this.name = name) {
        }
    }


    public ArrayList<District> getDistricts() {
        return districts;
    }

    public void setDistricts(ArrayList<District> districts) {
        this.districts = districts;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
