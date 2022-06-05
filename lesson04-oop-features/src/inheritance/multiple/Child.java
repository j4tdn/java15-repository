package inheritance.multiple;

//public class Child extends Father {
public class Child implements Dad, Mon {
	@Override
	public void playSport() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void smoking() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void shopping() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		Child son = new Child();
		son.smoking();
		son.playSport();
		
	}
}
