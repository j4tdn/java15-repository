package companymanagement;

import java.sql.Date;

public class HeadOfDepartment extends Staff {
		private int numberofemployee;
		
		public HeadOfDepartment() {
			
		}
		
		

		public HeadOfDepartment(String name, Date birthday, float coefficientsalary, int numberofemployee) {
			super(name, birthday, coefficientsalary);
			this.numberofemployee = numberofemployee;
		}



		public int getNumberofemployee() {
			return numberofemployee;
		}

		public void setNumberofemployee(int numberofemployee) {
			this.numberofemployee = numberofemployee;
		}



		@Override
		public String toString() {
			return "HeadOfDepartment [numberofemployee=" + numberofemployee + ", Staff=" + super.toString() + "]";
		}
		
		
		
		

}
