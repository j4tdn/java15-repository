package polymorphism.method;

public class PolyMethodChild extends PolyMethodParent{
	public static void main(String[] args) {
//		PolyMethodChild child = new PolyMethodChild();
		PolyMethodParent parent = new PolyMethodChild();
		parent.log();
		System.out.println(parent.text);
	}
	@Override
	void log() {
		System.out.println("child ==> text");
	}
	String text = "child ===> log";
}
