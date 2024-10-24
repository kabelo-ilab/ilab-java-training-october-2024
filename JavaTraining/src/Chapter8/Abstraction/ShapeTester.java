package Chapter8.Abstraction;

public class ShapeTester {
    public static void main(String[] args) {

        MyRectangle objRec = new MyRectangle(5,7);
        Square objSquare = new Square(6);

        objSquare.printDetails();
        objRec.printDetails();

    }
}
