package structure;

import bean.Item;

public class Ex06 {

    public static void main(String[] args) {
        // final --> cant update value at STACK
        final float PI = 3.14f;

        //wrong update
//        PI = 6.28f;

        final Item itemX = new Item(123,"Item123",250);
        System.out.println("ItemX:" + System.identityHashCode(itemX)); // xem biến hiện tạo đang trỏ ở vị trí nào trên HEAP
        Item itemY = new Item(133,"Item124",240);
        System.out.println("ItemX:" + System.identityHashCode(itemY)); // xem biến hiện tạo đang trỏ ở vị trí nào trên HEAP

        // không update itemX đc vì final ko sử dụng đc ở stack
//        itemX = itemY;

        System.out.println("ItemX" + System.identityHashCode(itemX)); // xem biến hiện tạo đang trỏ ở vị trí nào trên HEAP

        itemX.name = "hhhh";

        System.out.println(itemX);


    }
}
