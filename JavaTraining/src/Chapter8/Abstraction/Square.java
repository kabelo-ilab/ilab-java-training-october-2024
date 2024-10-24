package Chapter8.Abstraction;

public class Square extends Shape {
    private int side;
    public Square(int s){
        this.side = s;
    }
    @Override
    public int calcArea() {
        return this.side * this.side;
    }
    @Override
    public int calcParimeter() {
        return 4 * this.side;
    }
}
