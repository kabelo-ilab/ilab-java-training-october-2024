package Chapter5;

public class VoidMethods {

    public static void main(String[] args) {
        //call the method
        displayMessage();
        System.out.println("Main Method completed");

    }
    //normal void method - display a welcome message
    public static void displayMessage(){
//        System.out.println("==========Public Access Modifier==========");
//        System.out.println("Welcome To Java Training");

        displayMenu();
        System.out.println("Display Message method completed");

    }

    private static void displayMenu(){
//        System.out.println("==========Private Access Modifier==========");
//        System.out.println("Select option from the menu: \n" +
//                "1 - Add\n2 - Subtract\n3 - Divide\n4 - Multiply");

        System.out.println("Display Menu method completed");

    }
    public void displayName(String strName){
        System.out.println(strName);
    }
}
