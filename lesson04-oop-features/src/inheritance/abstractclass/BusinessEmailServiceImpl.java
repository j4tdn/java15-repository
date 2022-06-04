package inheritance.abstractclass;

public class BusinessEmailServiceImpl extends EmailService implements Transformer{

	@Override
	void login() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	void loginWith2Steps() {
		System.out.println("BusinessEmailServiceImpl --> loginWith2Steps");
	}
	
	@Override
	public void sending(boolean isSafe) {
		// TODO Auto-generated method stub
		System.out.println("BusinessEmailServiceImpl --> sending");
	}
}
