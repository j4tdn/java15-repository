package inheritance.multiple;

//public class Child extends Father {
public class Child implements Dad, Mom {
	public static void main(String[] args) {
		Child son = new Child();
		son.smoking();
		son.playSport();
	}

	@Override
	public void shopping() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void smoking() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playSport() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void gaming() {
		// TODO Auto-generated method stub
		Dad.super.gaming();
		Mom.super.gaming();
	}
}
