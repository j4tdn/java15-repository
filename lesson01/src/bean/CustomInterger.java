package bean;

public class CustomInterger {
    public int value;

    public CustomInterger(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "" + this.value ;
    }
}
