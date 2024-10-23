package Chapter7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, sum = 0;
        double quotient = 0;

        try{
            System.out.print("Enter number 1: ");
            num1 = sc.nextInt();//2.3
            System.out.print("Enter number 2: ");
            num2 = sc.nextInt();

            sum = calcSum(num1, num2);
            quotient = calcQuotient(num1, num2);

            System.out.println("Sum: " + sum + "\nQuotient: " + quotient);
        }catch (InputMismatchException e){
            System.out.println("Please enter whole number only");
        }catch (ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
    }

    public static int calcSum(int x, int y){
        return x + y;
    }
    public static double calcQuotient(int x, int y){
        return x / y;
    }
}
