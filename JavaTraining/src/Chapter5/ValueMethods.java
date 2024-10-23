package Chapter5;

import java.util.Scanner;

public class ValueMethods {
    public static void main(String[] args) {

       int sum = calculateSum();//8
        double q = calculateQuotient();

        System.out.println("Sum: " + sum);
        System.out.println("Quotient: " + q);

    }

    public static int calculateSum(){
        Scanner sc = new Scanner(System.in);
        int number1, number2;
        int sum = 0;

        System.out.print("Enter number 1: ");
        number1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        number2 = sc.nextInt();

        sum = number1 + number2;//8

        return sum;//(8)this should be the last line of code
    }

    public static double calculateQuotient(){
        int number1 = 7, number2 = 3;
        double quotient = number1 / number2;

        return quotient;
    }


}
