package Chapter5;

import java.util.Scanner;

public class ParameterizedMethods {
    public static void main(String[] args) {

        int sum, num1, num2;
        Scanner sc = new Scanner(System.in);

        displayMessage("Welcome to Java Training");

        System.out.print("Enter number 1:");
        num1 = sc.nextInt();
        System.out.print("Enter number 2:");
        num2 = sc.nextInt();

        System.out.println("==========Hard coded values==============");
        sum = calculateSum(2,9);//11
        System.out.println("Sum: " + sum);

        System.out.println("==========Values from scanner object==============");
        sum = calculateSum(num1,num2);
        System.out.println("Sum: " + sum);
    }
    public static void displayMessage(String message){
        System.out.println(message);
    }
                                    //declare
    public static int calculateSum(int number1, int number2){
        int sum = number1 + number2;
        return sum;
    }
}
