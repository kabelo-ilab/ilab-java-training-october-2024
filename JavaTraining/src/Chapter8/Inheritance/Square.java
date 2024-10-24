package Chapter8.Inheritance;

public class Square extends Shape{
    public Square(int side){
        this.setLength(side);
    }

    @Override
    public int calcArea() {
        return this.getLength() * this.getLength();
    }

    @Override
    public void displayDetails() {
        System.out.println("======" + this.getClass().getName() + "=======");
        System.out.println("Side: " + getLength() +
                "\nArea: " + calcArea());
    }
}
