package inheritance.abstractclass;

public class BusinessEmailServiceImpl extends EmailService implements Transformer {
	@Override
	void login() {
		System.out.println("BusinessEmailServiceImpl --> login");
		
	}
	
	@Override
	void loginWith2Steps() {
		System.out.println("BusinessEmailServiceImpl --> loginWith2Step");
	}
	
	@Override
	public void sending(boolean isSafe) {
		System.out.println("BusinessEmailServiceImpl --> sending");
		
	}
}
