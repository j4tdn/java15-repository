package inheritance;

public class BookApp {
    public static void main(String[] args) {
        TextBook textBook = new TextBook("TB1","Math01",50.4,"",Level.BASIC);
        TextBook textBook2 = new TextBook("TB1","Math01",50.4,"",Level.ADVANCED);

        ReferenceBook referenceBook = new ReferenceBook("","",50.4,"",0.5);
        ReferenceBook referenceBook2 = new ReferenceBook("","",50.4,"",0.5);
    }
}
