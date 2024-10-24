package Chapter8.Interfaces;

public class Square implements IShape, IGraphics{
    private double side;
    public Square(double s){
        this.side = s;
    }

    @Override
    public void drawShape() {
        System.out.println("Drawing " + this.getClass().getName());
    }

    @Override
    public void applyPaint(String paintColor) {

        System.out.println("Applying " + paintColor +
                " color on " + this.getClass().getName());
    }

    @Override
    public double calcArea() {
        return side * side;
    }

    @Override
    public double calcPerimeter() {
        return 4 * side;
    }

    public void displayDetails(){
        drawShape();
        applyPaint("blue");
        System.out.println("Side: " + side +
                "\nArea: " + calcArea() +
                "\nPerimeter: " + calcPerimeter());
    }
}
