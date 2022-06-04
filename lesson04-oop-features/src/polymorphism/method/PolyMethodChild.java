package polymorphism.method;

public class PolyMethodChild extends PolyMethodParent{
	String text = "child ==> text";
	public PolyMethodChild() {
		
	}
	public static void main(String[] args) {
		PolyMethodParent child = new PolyMethodChild();
		System.out.println(child.text);
		child.log();
	}
	
	
	@Override
	void log() {
		System.out.println("child ==> log");
	}
}
