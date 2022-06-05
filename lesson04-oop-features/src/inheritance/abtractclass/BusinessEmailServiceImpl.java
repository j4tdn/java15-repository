package inheritance.abtractclass;

public class BusinessEmailServiceImpl extends EmailService implements Transformer {
	@Override
	void login() {
		System.out.println("BussinessEmailServiceImpl --> login");
	}

	@Override
	void loginWith2Step() {
		System.out.println("BussinessEmailServiceImplm --> loginWith2Step");
	}

	@Override
	public void sending(boolean isSafe) {
		System.out.println("BusinessEmailService --> sending");
	}

}
