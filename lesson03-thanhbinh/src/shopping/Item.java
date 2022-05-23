package shopping;

public class Item {
    private String id;
    private String os;
    private String color;
    private Double price; // database: column:null, non-null:extra-info:text

    public Item() {
    }

    public Item(String id, String os, String color, double price) {
        this.id = id;
        this.os = os;
        this.color = color;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
