package Ex04;

public class TextBook extends Book{
    private String status;

    public TextBook(String id_book, double price_book, String producer, String status) {
        super(id_book, price_book, producer);
        this.status = status;
    }

    public TextBook(String status) {
        this.status = status;
    }

    public TextBook() {
    }

    public static void disCount(String status){
        if (status.equals("old")){
            return;
        }
    }
}
