package ex04.model;

public class Manager extends Human{
    int memberManager;

    public Manager() {
    }

    public Manager(String name, float coefficientsSalary, int memberManager) {
        super(name, coefficientsSalary);
        this.memberManager = memberManager;
    }

    public int getMemberManager() {
        return memberManager;
    }

    public void setMemberManager(int memberManager) {
        this.memberManager = memberManager;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", CoefficientsSalary=" + CoefficientsSalary +
                ", memberManager=" + memberManager +
                '}';
    }
}
