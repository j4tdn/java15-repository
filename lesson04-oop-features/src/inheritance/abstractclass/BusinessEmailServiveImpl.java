package inheritance.abstractclass;

public class BusinessEmailServiveImpl extends EmailService implements Transfomer{

	@Override
	void login() {
		System.out.println("BussinessEmailServiceImpl --> login");
		
	}
	@Override
	void loginWith2Steps() {
		System.out.println("BussinessEmailServiceImpl --> loginWith2Steps");
	}
	@Override
	public void sending(boolean isSafe) {
		System.out.println("BussinessEmailServiceImpl --> sending");
		
	}
}

