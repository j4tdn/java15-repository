package bean;

public class SinhVien {
		private int id;
		private int Gpa;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getPoint() {
			return Gpa;
		}
		public void setPoint(int point) {
			this.Gpa = point;
		}
		public SinhVien(int id) {
			this.id = id;
			this.Gpa = 0;
		}
		@Override
		public String toString() {
			return "ThiSinh [id=" + id + ", point=" + Gpa + "]";	
	}
}
