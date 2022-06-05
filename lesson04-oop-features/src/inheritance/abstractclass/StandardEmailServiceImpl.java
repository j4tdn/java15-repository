package inheritance.abstractclass;

public class StandardEmailServiceImpl extends EmailService {
	@Override
	void login() {
		System.out.println("StanderdEmailServiceImpl --> login");
	}
	
}
