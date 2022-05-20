package view;
// Internal 

public class Ex06StaticScope {
	public static void main(String[] args) {
		add();
		// subtract();
		multiple();
		// devide();
	}

//timming:static -> non-static
//static -> can calling static & can not calling nonstatic
//non-static-> static & nontatic => ok
	private static void add() {
		multiple();
//devide();
	}

	private void subtract() {
		devide();
		multiple();
	}

	private static void multiple() {

	}

	private void devide() {

	}
}
