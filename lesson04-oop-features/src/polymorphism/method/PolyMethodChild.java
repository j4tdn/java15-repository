package polymorphism.method;

public class PolyMethodChild extends PolyMethodParent{
	public static void main(String[] args) {
           PolyMethodChild child = new PolyMethodChild();
           System.out.println(child.text);
           child.log();
	}
	
	void log() {
		System.out.println("child ==> log");
	}
}
