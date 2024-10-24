package Chapter8.Polymorphism;

public class ShapeTester {
    public static void main(String[] args) {
        Shape objShape = new Shape(5,4);//parent
        MyRectangle objRec = new MyRectangle(6,8);//child

        //Parent                 //Child
        Shape myShape = new MyRectangle(4,5);


    }
}
