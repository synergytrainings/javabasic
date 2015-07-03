package main;


public class ImplementationOfBase implements Base{

		private int id;
		private String name;

		public ImplementationOfBase(int id, String name) {
			this.id = id;
			this.name = name;
		}

		public int getId() {
			return this.id;
		}
		
		public void setId(int id){
			this.id = id;
		}

	
		public String getName() {
			return this.name;
		}


	
		@Override
		public boolean equals(Object obj) {
			return obj==this || obj != null && getClass().equals(obj.getClass()) && id==((Base)obj).getId();
		}		
	}



