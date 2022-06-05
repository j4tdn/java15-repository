package Ex04;

public class Book {
    private String id_book;
    private double price_book;
    private String producer;

    public Book(String id_book, double price_book, String producer) {
        this.id_book = id_book;
        this.price_book = price_book;
        this.producer = producer;
    }

    public Book() {
    }

    public String getId_book() {
        return id_book;
    }

    public void setId_book(String id_book) {
        this.id_book = id_book;
    }

    public double getPrice_book() {
        return price_book;
    }

    public void setPrice_book(double price_book) {
        this.price_book = price_book;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
