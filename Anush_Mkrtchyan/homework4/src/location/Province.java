package location;

public class Province extends Location {
	  public Region region;
	  public Province(int ID, String Name, String Code, Region region) {
			this.ID = ID;
			this.Name = Name;
			this.Code = Code;
			this.region = region;
		} 
}
