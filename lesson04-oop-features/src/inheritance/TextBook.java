package inheritance;

public class TextBook extends Book{
    private Level level;

    public TextBook() {

    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public Level getLevel() {
        return level;
    }
}
