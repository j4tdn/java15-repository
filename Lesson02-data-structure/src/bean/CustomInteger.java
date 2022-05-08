package bean;

public class CustomInteger {

 public int value;
  // Ham khoi tao bat buoc ten phai trung voi ten class
 public CustomInteger(int valuePr) {
	 this.value = valuePr;
	 
 }
 
	@Override
		public String toString() {
			return this.value +"";
		}

}
