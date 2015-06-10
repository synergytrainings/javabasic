package location;

public class Controller {

	public static void main(String[] args) {
		Region[] region = new Region[3];
		region[0] = new Region(1, "Atacama", "01");
		region[1] = new Region(2, "Coquimbo", "02");
		region[2] = new Region(3, "Los Lagos", "03");

		Province[] province = new Province[6];
		province[0] = new Province(1, "Copiapó", "011", region[0]);
		province[1] = new Province(2, "Limarí", "012", region[0]);
		province[2] = new Province(3, "Maipo", "021", region[1]);
		province[3] = new Province(4, "Palena", "022", region[1]);
		province[4] = new Province(5, "Talca", "031", region[2]);
		province[5] = new Province(6, "GISOZI", "032", region[2]);

		District[] district = new District[15];
		district[0] = new District(1, "Calbuco", "0111", province[0]);
		district[1] = new District(2, "Juana", "0112", province[0]);
		district[2] = new District(3, "Lo Prado", "0121", province[1]);
		district[3] = new District(4, "Los Muermos", "0122", province[1]);
		district[4] = new District(5, "Rancagua", "0211", province[2]);
		district[5] = new District(6, "GItega", "0211", province[2]);
		district[6] = new District(7, "KANYINYA", "0221", province[3]);
		district[7] = new District(8, "KIGALI", "0222", province[3]);
		district[8] = new District(9, "KIMISAGARA", "0311", province[4]);
		district[9] = new District(10, "MAGEREGERE", "0312", province[4]);
		district[10] = new District(11, "MUHIMA", "0321", province[5]);
		district[11] = new District(12, "NYAKABANDA", "0322", province[5]);
		district[12] = new District(13, "NYAMIRAMBO", "0323", province[5]);
		district[13] = new District(14, "NYARUGENGE", "0323", province[5]);
		district[14] = new District(15, "RWEZAMENYO", "0324", province[5]);

		for (int i = 0; i < 15; i++)
			System.out.println(district[i].province.region.getName() + " "
					+ district[i].province.getName() + " "
					+ district[i].getName());

	}

}
