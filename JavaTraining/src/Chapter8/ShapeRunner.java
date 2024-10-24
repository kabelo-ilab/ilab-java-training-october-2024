package Chapter8;

public class ShapeRunner {
    public static void main(String[] args) {
        Shape shape1 = new Shape();//Default constructor
        shape1.setLength(12);
        shape1.setWidth(7);
        Shape shape2 = new Shape(6,3);//Overloaded constructor

        System.out.println("============Shape 1======================");
        System.out.println("Length: " + shape1.getLength());
        System.out.println("Width: " + shape1.getWidth());
        System.out.println("Area : " + shape1.calcArea());
        System.out.println("============Shape 2======================");
        System.out.println("Length: " + shape2.getLength());
        System.out.println("Width: " + shape2.getWidth());
        System.out.println("Area : " + shape2.calcArea());
    }
}
