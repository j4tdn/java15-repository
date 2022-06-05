package polymorphism.object;

public class ShapeApp {
    /*
    1. tại sao không khai báo trục tiếp KDL lúc complie và runtime giống nhau
    + áp dụng factory patten
    + dễ dàng chuyển đổi KDL qua về
    + tạo tập hợp các phần tử KDL cha , con đưa vào 1 mảng chung duy nhất
    + convention
    2. nếu lấy KDL của lóp con new KDL của lớp cha đc không
    + cha = con => ok
    + else => no
    3. lấy KDL lúc compile và runtime không có qhe đc ko --> không
     */
    public static void main(String[] args) {
        Shape shapeRect = ShapeFactory.creShape(ShapeType.RECTANGLE);
        shapeRect.draw();
        shapeRect.calS();

        System.out.println("===========================");

        Shape shapeSquare = ShapeFactory.creShape(ShapeType.SQUARE);
        shapeSquare.draw();
        shapeSquare.calS();

        shapeRect = shapeSquare;
        Shape[] shapes = {shapeRect,shapeSquare};
        System.out.println(shapes.length);

        Shape r2 = new Rectangle();
        ((Rectangle) r2).setBackground();

    }
}
