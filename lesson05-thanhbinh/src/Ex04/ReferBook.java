package Ex04;

public class ReferBook extends Book{

    private double tax;

    public ReferBook() {
    }

    public ReferBook(String id_book, double price_book, String producer, double tax) {
        super(id_book, price_book, producer);
        this.tax = tax;
    }

    public ReferBook(double tax) {
        this.tax = tax;
    }
}
