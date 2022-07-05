package inheritance.multiple;

//public class Child extends Father{
public class Child implements Dad, Mom{
	
	@Override
	public void shopping() {
		
		
	}

	@Override
	public void smoking() {
		
		
	}

	@Override
	public void playSport() {
		
		
	}
	public void gaming() {
		Dad.super.gaming();
		Mom.super.gaming();
	}
	public static void main(String[] args) {
		Child son = new Child();
		son.smoking();
		son.playSport();
	}

}
