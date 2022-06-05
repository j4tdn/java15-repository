package polymorphism.method;

public class PoLyMethodChild extends PoLyMethodParent{
	String text = "child===>text";
	public static void main(String[] args) {
		PoLyMethodParent child = new PoLyMethodChild();
		System.out.println(child.text);
		child.log();
	}
	@Override
	void log() {
		System.out.println("child====>log");
	}
	
}
