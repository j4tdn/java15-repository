package inheritance.abstractclass;

public class BusineeEmailServiceImpl extends EmailService implements Transformer {
	@Override
	void login(){
		System.out.println("BusineeEmailServiceImpl --> login");
	}
	@Override
	void loginWith2Steps(){
		System.out.println("BusineeEmailServiceImpl --> loginWith2Steps");
	}
	
	@Override
	public void sending(boolean isSafe) {
		System.out.println("BusineeEmailServiceImpl --> sending");
	}
}
