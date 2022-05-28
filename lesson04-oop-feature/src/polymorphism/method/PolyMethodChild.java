package polymorphism.method;

public class PolyMethodChild extends PolyMethodParent {
	public static void main(String[] args) {
		// PolyMethodChild child = new PolyMethodChild();
		
		PolyMethodParent parent = new PolyMethodChild();
		System.out.println(parent.text);
		parent.log();
		
	}
	
	String text = "child ==> text";
	
	@Override
	void log() {
		System.out.println("child ==> log");
	}
}
