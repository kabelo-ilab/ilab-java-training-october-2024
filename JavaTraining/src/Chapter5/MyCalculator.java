package Chapter5;

import java.util.Scanner;
public class MyCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1, number2;
        int menuOption;
        float results = 0;

        do {
            displayMenu();
            menuOption = sc.nextInt();
        }while (menuOption < 1 || menuOption > 4);

        System.out.print("Enter number 1: ");
        number1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        number2 = sc.nextInt();

        switch (menuOption){
            case 1 :  results = calcSum(number1, number2);
            break;
            case 2 :  results = calcDifference(number1, number2);
                break;
            case 3 :
                while (number2 == 0){
                    System.out.print("Number 2 cannot be zero. Please provide a " +
                            "different number. Enter number 2:");
                    number2 = sc.nextInt();//6
                }
                results = calcQuotient(number1, number2);
                break;
            case 4 :  results = calcProduct(number1, number2);
                break;
        }

        System.out.println("Results: " + results);
    }

    public static int calcSum(int x, int y){
        return x + y;
    }
    public static int calcDifference(int x, int y){
        int diff = x - y;
        return diff;
    }

    public static int calcProduct(int x, int y){
        int product = x * y;
        return product;
    }
    public static float calcQuotient(int x, int y){
        float q = x / y;
        return q;
    }

    public static void displayMenu(){
        System.out.println("Select option from the menu: \n" +
                "1 - Add\n2 - Subtract\n3 - Divide\n4 - Multiply");

    }
}
