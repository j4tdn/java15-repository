package Vehicle;

public class Vehicle {
    private String nameCarOwner;
    private String type;
    private int capacity;
    private double value;

    public Vehicle() {
    }

    public Vehicle(String nameCarOwner, String type, int capacity, double value) {
        this.nameCarOwner = nameCarOwner;
        this.type = type;
        this.capacity = capacity;
        this.value = value;
    }

    public String getNameCarOwner() {
        return nameCarOwner;
    }

    public void setNameCarOwner(String nameCarOwner) {
        this.nameCarOwner = nameCarOwner;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public static double calculatoTax (Vehicle car){

        if (car.getCapacity() < 100) {
            return car.getValue() * 0.01;
        } else if (car.getCapacity() >= 100 && car.getCapacity() <= 200) {
            return car.getValue() * 0.03;
        } else
            return car.getValue() * 0.05;
    }
}
