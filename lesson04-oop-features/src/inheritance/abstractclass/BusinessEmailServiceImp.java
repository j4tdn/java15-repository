package inheritance.abstractclass;

public class BusinessEmailServiceImp extends EmailService implements Transformer {
    public static void main(String[] args) {
		BusinessEmailServiceImp o1 = new BusinessEmailServiceImp();
		o1.login();
		o1.loginWith2Steps();
		o1.sending(false);
	}
	@Override
	void login() {
		// TODO Auto-generated method stub
		System.out.println("BusinessEmailServiceImp --> login");
	}

	@Override
	void loginWith2Steps() {
		// TODO Auto-generated method stub
		System.out.println("BusinessEmailServiceImp --> loginWith2Steps");
		super.loginWith2Steps();
	}

	@Override
	public void sending(boolean isSafe) {
		// TODO Auto-generated method stub
		System.out.println("BusinessEmailServiceImp --> Sending");
	}
}
