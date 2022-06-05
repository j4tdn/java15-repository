package polymorphism.method;

public class PolyMethodChild extends PolyMethodParent {
	public static void main(String[] args) {
		// PolyMethodChild child = new PolyMethodChild();
		PolyMethodParent parent = new PolyMethodChild();
		System.out.println(parent.text); // child
		parent.log(); // child

	}

	String text = "child ==> text";

	void log() {
		System.out.println("text ==> child");

	}
}
