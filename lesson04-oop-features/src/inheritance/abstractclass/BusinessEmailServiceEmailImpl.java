package inheritance.abstractclass;

public class BusinessEmailServiceEmailImpl extends EmailService implements Transformer {
	@Override
	void login() {
		System.out.println("BusinesssEmailServiceImpl --> login");

	}

	@Override
	void loginWith2Step() {
		System.out.println("BusinesssEmailServiceImpl -->");
	}

	@Override
	public void sending(boolean isShape) {
		System.out.println("BusinesssEmailServiceImpl --> sending");
	}
}
