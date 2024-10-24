package Chapter8.Abstraction;

public class MyRectangle extends Shape{
    private int length, width;
    public MyRectangle(int l, int w){
        this.length = l;
        this.width = w;
    }

    @Override
    public int calcArea() {
        return this.width * this.length;
    }
    @Override
    public int calcParimeter() {
        return (2 * this.length) + (2 * this.width);
    }
}
