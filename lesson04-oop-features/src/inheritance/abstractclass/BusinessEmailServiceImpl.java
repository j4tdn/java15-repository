package inheritance.abstractclass;

public class BusinessEmailServiceImpl extends EmailService implements Transformer {

	@Override
	void login() {
		System.out.println("BussinessEmailServiceImpl --> login");
	}
	@Override
	void loginWith2Steps() {
		System.out.println("BusinessEmailServiceImpl --> loginWith2Steps");
	}
	@Override
	public void sending(boolean isSafe) {
		System.out.println("BusinessEmailServiceImpl --> sending");
	}
	
}
