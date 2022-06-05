package inheritance.abstractclass;

public class StandardEmailServiceIImpl extends EmailService{
    @Override
    void login() {
        System.out.println("StandardEmailService ");
    }
}
