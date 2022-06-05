package polymorphism.object;

public class ShapeFactory {

    private ShapeFactory(){

    }

    public static Shape creShape(ShapeType shapeType){
        switch (shapeType){
            case SQUARE:
                return new Square();
            case RECTANGLE:
                return new Rectangle();
        }
        return new Shape();
    }
}
