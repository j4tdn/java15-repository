package inheritance.abstractclass;
//theo đúng thứ tự bên dưới, có thể inplements nhiều interface,  class chỉ có thể kết thừa một class
public class BusinessEmailServiceImpl extends EmailService implements Transformer{
	@Override
	void login() {
		System.out.println("BusinessEmailServiceImpl --> login");
		
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
