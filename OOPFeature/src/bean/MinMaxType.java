package bean;

public class MinMaxType {
    int max;
    int min;

    public MinMaxType(int max, int min) {
        this.max = max;
        this.min = min;
    }


    @Override
    public String
    toString() {
        return "MinMaxType{" +
                "max=" + max +
                ", min=" + min +
                '}';
    }
}
