package inheritance.multiple;

//public class Child extends Father {
public class Child implements Dad, Mom{
	public static void main(String[] args) {
		Child son = new Child();
		son.smoking();
		son.playSport();
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
