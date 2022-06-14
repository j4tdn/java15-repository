package inheritance.multiple;

public class Child implements Dad, Mom {
	@Override
	public void playSport() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void shopping() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void smoking() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		Child son = new Child();
		son.playSport();
		son.smoking();
	}
}
