package polymorphism.method;

public class PolyMethodChild extends PolyMethodParent{
	
	public static void main(String[] args) {
		// TODO
		PolyMethodChild child = new PolyMethodChild();
		
		// PolyMethodParent parent = new PolyMethodChild();
		
		System.out.println(child.text); // parent
		child.log(); // child
	}
	
	String text = "child ==> text";
	
	@Override
	void log() {
		System.out.println("child ==> log");
	}
}
