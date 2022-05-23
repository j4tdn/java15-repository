package shopping;

import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) {
        /*
        c1: KH1, Adam, 123, NewYork
        c1: KH2, Kate, 234, California

        i1: SS10+, android, black, 620
        it2: ss20U, android, Green, 840
        it3: IP4, IOS,Black, White, 280
        it4 : ip12, ios, blcok. 880
        it5 wp8, windowphone, blue, 560
         */

        Customer c1 = new Customer("KH1", "Adam", "123", "NewYork");
        Customer c2 = new Customer("KH2", "Kate", "234", "California");

        Item i1 = new Item("SS10+", "android", "black", 620);
        Item i2 = new Item("ss20U", "android", "Green", 840);
        Item i3 = new Item("IP4", "IOS", "Black", 280);
        Item i4 = new Item("ip12", "ios", "Black", 880);
        Item i5 = new Item("wp8", "windowphone", "blue", 560);

        ItemDetail[] ids = new ItemDetail[] {
                new ItemDetail(i1,3),
                new ItemDetail(i4,5),
                new ItemDetail(i2,1),
        };

        Order o1 = new Order(c1,new ItemDetail[]{
                new ItemDetail(i1,3),
                new ItemDetail(i4,5),
                new ItemDetail(i2,1),

        }, LocalDateTime.of(2021,5,8,10,10,10));

    }
}