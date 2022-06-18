package ex04.model;

public class Director extends Human{
    float CofficientPosition;

    public Director() {
    }

    public Director(String name, float coefficientsSalary, float cofficientPosition) {
        super(name, coefficientsSalary);
        CofficientPosition = cofficientPosition;
    }

    public float getCofficientPosition() {
        return CofficientPosition;
    }

    public void setCofficientPosition(float cofficientPosition) {
        CofficientPosition = cofficientPosition;
    }

    @Override
    public String toString() {
        return "Director{" +
                "CofficientPosition=" + CofficientPosition +
                ", name='" + name + '\'' +
                ", CoefficientsSalary=" + CoefficientsSalary +
                '}';
    }
}
