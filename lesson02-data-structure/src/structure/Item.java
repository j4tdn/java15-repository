package structure;

public class Item {
    // cấu trúc dữ liệu --> biến, thuộc tính
    //thuật toán --> hàm, phương thức
    public int itemId;
    public String name;
    public double price;

    public Item() {
        // sẽ mất đi khi mình thêm hàm khỏi tạo khác
    }

    public Item(int itemId, String name, double price) {
        this.itemId = itemId;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId=" + itemId +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

}
