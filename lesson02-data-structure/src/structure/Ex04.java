package structure;

import bean.Item;

public class Ex04 {
    public static void main(String[] args) {
        Item item2 = new Item(23, "Rim", 230);
        Item item1 = new Item(23, "Rim", 230);
        System.out.println(Integer.toHexString(item1.hashCode()));
        System.out.println(item2.hashCode());
    }
}
