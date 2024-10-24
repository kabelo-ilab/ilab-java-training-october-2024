package Chapter8;

public class Shape {
    private int length;
    private int width;

    //constructors
    //default
    public Shape(){
        length = 5;
        width = 10;
    }
    //overloaded
    public Shape(int theLength, int theWidth){
        length = theLength;
        width = theWidth;
    }
    public void setWidth(int w){
        width = w;
    }
    public int getWidth(){
        return width;
    }
    public void setLength(int l){
        length = l;
    }
    public int getLength(){
        return length;
    }
    public int calcArea(){
        return length * width;
    }

}
