package Chapter8.Polymorphism;

import Chapter8.Polymorphism.Shape;

public class MyRectangle extends Shape {

    public MyRectangle(int l, int w){
        this.setLength(l);
        this.setWidth(w);
    }
    public int calcParimeter(){
        return (2 * getLength()) + (2 * getWidth());
    }
}