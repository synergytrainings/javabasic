package location;

public class District extends Location {
	public Province province;
	  public District(int ID, String Name, String Code, Province province) {
			this.ID = ID;
			this.Name = Name;
			this.Code = Code;
			this.province = province;
		} 
}
