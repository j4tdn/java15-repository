package ex04.model;

public class Human {
    String name;
    float CoefficientsSalary;

    public Human() {
    }

    public Human(String name, float coefficientsSalary) {
        this.name = name;
        CoefficientsSalary = coefficientsSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCoefficientsSalary() {
        return CoefficientsSalary;
    }

    public void setCoefficientsSalary(float coefficientsSalary) {
        CoefficientsSalary = coefficientsSalary;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", CoefficientsSalary=" + CoefficientsSalary +
                '}';
    }
}
