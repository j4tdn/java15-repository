package inheritance.multiple;

//public class Child extends Father {
// ĐA THỰC THI( thực thi lại hàm trừu tượng tỏng interface)
	public class Child implements Dad,Mom{
	public static void main(String[] args) {
		Child son= new Child();
		son.playSport();
		son.smoking();
	}

	@Override
	public void shopping() {
		
	}

	@Override
	public void smoking() {
		
	}

	@Override
	public void playSport() {
		
	}
}
