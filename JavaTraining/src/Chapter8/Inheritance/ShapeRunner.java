package Chapter8.Inheritance;

public class ShapeRunner {
    public static void main(String[] args) {
        Shape objShape = new Shape(5,8);
        MyRectangle objRectangle = new MyRectangle(4,8);
        Square sq = new Square(5);

        objShape.displayDetails();
        objRectangle.displayDetails();
        sq.displayDetails();
    }
}
