package Chapter8.Inheritance;
//MyRectangle class inherites from Shape class
public class MyRectangle extends Shape {

    public MyRectangle(int l, int w){
        this.setLength(l);
        this.setWidth(w);
    }
    public int calcParimeter(){
        return (2 * getLength()) + (2 * getWidth());
    }
}
