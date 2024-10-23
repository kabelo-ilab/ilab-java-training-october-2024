package Chapter5;

public class VoidMethods {
    public static void main(String[] args) {
        //call the methods
        displayMessage();
        displayMenu();
    }
    //normal method without access modifier
    static void displayMessage(){
        System.out.println("Java Training");
    }

    //normal method with public access
    public static void displayMenu(){
        System.out.println("Select option from the menu: \n" +
                "1 - Add\n2 - Subtract\n3 - Divide\n4 - Multiply");
    }
}
