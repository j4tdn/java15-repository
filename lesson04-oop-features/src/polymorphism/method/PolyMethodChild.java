package polymorphism.method;

public class PolyMethodChild extends PolyMethodParent{
	
	public static void main(String[] args) {
		// TODO
		PolyMethodChild child = new PolyMethodChild();
		System.out.println(child.text); // parent
		System.out.println(child.ptext); // parent
		child.log(); // child
		
		PolyMethodParent parent = new PolyMethodChild();
		System.out.println(parent.ptext); // cha
		parent.log(); // con
		
		
	}
	
	String text = "child ==> text";
	
	@Override
	void log() {
		System.out.println("child ==> log");
	}
}
