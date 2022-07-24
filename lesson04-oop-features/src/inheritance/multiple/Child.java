package inheritance.multiple;
// public class Child extends Father, Mother{
public class Child implements Dad, Mom{
	
	
	@Override
	public void gaming() {
		// TODO Auto-generated method stub
		Dad.super.gaming();
		//Mom.super.gaming();
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
	
	
	
	public static void main(String[] args) {
		Child son = new Child();
		son.smoking();
		son.playSport();
		son.gaming();
	}

	

	
}