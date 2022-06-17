package bean;

 class CustomInteger {
	public int value;
	
	public CustomInteger(int value) {
		this.value = value;
		// in ra biến kiểu đối tượng tự động in ra hàm to string
		
	}
	@Override
	public String toString() {
		return this.value + "";
	}
	
}
