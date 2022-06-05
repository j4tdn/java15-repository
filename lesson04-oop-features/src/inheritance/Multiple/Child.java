package inheritance.Multiple;

//public class Child extends Father{
	public class Child implements Dad, Mom{
	public static void main(String[] args) {
		Child son = new Child();
		son.playSport();
		son.smoking();
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
		System.out.println("Child -->playfb");
	}
}
