package ex04.model;

public class Employee extends Human{
    String nameUnit;

    public Employee() {
    }

    public Employee(String name, float coefficientsSalary, String nameUnit) {
        super(name, coefficientsSalary);
        this.nameUnit = nameUnit;
    }

    public String getNameUnit() {
        return nameUnit;
    }

    public void setNameUnit(String nameUnit) {
        this.nameUnit = nameUnit;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "nameUnit='" + nameUnit + '\'' +
                ", name='" + name + '\'' +
                ", CoefficientsSalary=" + CoefficientsSalary +
                '}';
    }
}
