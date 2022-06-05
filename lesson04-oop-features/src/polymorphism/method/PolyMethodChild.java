package polymorphism.method;

public class PolyMethodChild extends PolyMethodParent {
	
	public static void main(String[] args) {
		PolyMethodChild child = new PolyMethodChild();
		
		System.out.println(child.text);
		child.log();
	}
	
	String text = "child ==> text";
	// chỉ override hàm, thuộc tính thì không 
	
	void log() {
		
		System.out.println("CHild ==> log");
	}
}
