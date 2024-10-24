package Chapter8.Abstraction;

public abstract class Shape {
    public abstract int calcArea();
    public abstract int calcParimeter();
    //normal methods
    public void printDetails(){
        System.out.println("Area of " + this.getClass().getName() +
                " is " + this.calcArea());
    }

}
