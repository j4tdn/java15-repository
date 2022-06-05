package Ex04;

import java.util.ArrayList;

public class Ex04 {
    public static void main(String[] args) {
        listBook();
    }


    private static void listBook() {
        TextBook textBook1 = new TextBook("SGK1", 150, "A", "new");
        TextBook textBook2 = new TextBook("SGK2", 200, "Nhi Đồng", "new");
        TextBook textBook3 = new TextBook("SGK3", 50, "Nhi Đồng", "old");

        ReferBook referBook1 = new ReferBook("STK1",200,"Nhi Đồng",253);
        ReferBook referBook2 = new ReferBook("STK2",25,"B",253);

        Book [] book = {textBook1,textBook2,textBook3,referBook1,referBook2};

        checkProducer(book);
        checkPrice(book);
        checkinClausePrice(book);
        checkBill(book);
    }

    private static void checkBill(Book[] books) {
        for (Book book: books) {
            if (book instanceof ReferBook) {
                ReferBook rb = (ReferBook)book;
                if (rb.getPrice_book()>100 && rb.getPrice_book()<200 ){
                    System.out.println(rb.getId_book());
                }
            }
            if (book instanceof TextBook){
                TextBook tb = (TextBook) book;
                if (tb.getPrice_book()>100 && tb.getPrice_book()<200 ){
                    System.out.println(tb.getId_book());
                }
            }
        }
    }

    private static void checkinClausePrice(Book[] books) {
        for (Book book: books) {
            if (book instanceof ReferBook) {
                ReferBook rb = (ReferBook)book;
                if (rb.getPrice_book()>100 && rb.getPrice_book()<200 ){
                    System.out.println(rb.getId_book());
                }
            }
            if (book instanceof TextBook){
                TextBook tb = (TextBook) book;
                if (tb.getPrice_book()>100 && tb.getPrice_book()<200 ){
                    System.out.println(tb.getId_book());
                }
            }
        }
    }

    private static void checkPrice(Book[] books) {
        for (Book book: books) {
            if (book instanceof ReferBook) {
                ReferBook rb = (ReferBook)book;
                if (rb.getPrice_book()<50){
                    System.out.println(rb.getId_book());
                }
            }
            if (book instanceof TextBook){
                TextBook tb = (TextBook) book;
                if (tb.getPrice_book()<50){
                    System.out.println(tb.getId_book());
                }
            }
        }
    }

    private static void checkProducer(Book[] books) {
        for (Book book: books) {
            if (book instanceof ReferBook) {
                ReferBook rb = (ReferBook)book;
                if (rb.getProducer().equals("Nhi Đồng")){
                    System.out.println(rb.getId_book());
                }
            }
            if (book instanceof TextBook){
                TextBook tb = (TextBook) book;
                if (tb.getProducer().equals("Nhi Đồng")){
                    System.out.println(tb.getId_book());
                }
            }
        }
    }
}
