package inheritance.multiple;

// Ä�a thá»±c thi, thá»±c thi láº¡i cÃ¡c hÃ m trong interface

//public class Child extends Father  {
public class Child implements Dad, Mom {
	@Override
	public void choike() {
		// TODO Auto-generated method stub
		
	}
	
	
	@Override
	public void dibar() {
		// TODO Auto-generated method stub
		
		
	}
	@Override
	public void playPS5() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		Child son = new Child();
		son.choike();
		son.playPS5();
		son.choibai();
	}
	
	
}
