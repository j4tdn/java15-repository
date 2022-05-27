package structure;

import bean.Item;

public class Ex04 {
    public static void main(String[] args) {
        //
        int age =18;
        double price = 22.50;
        char letter = 'X';

        System.out.println("Age" + age);
        System.out.println("price" + price);
        System.out.println("letter" + letter);

        //Object Type

        // toString in ra giá trị thông tin của đối tượng hiện tại

        //new Item() --> khởi tạo đối tượng , ô nhớ HEAp lưu trữ giá trị
        Item itemA = new Item(123,"mmmmm",222);
        System.out.println("ItemA" + itemA);

    }
}
