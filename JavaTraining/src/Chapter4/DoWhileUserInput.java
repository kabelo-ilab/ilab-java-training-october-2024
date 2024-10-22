package Chapter4;

import java.util.Scanner;

/*Ask the user to enter two integers, let them select an operation between
* Add, Subtract, Divide, and multiply. Compute and display the results*/
public class DoWhileUserInput {
    public static void main(String[] args) {
        //menu(1 - Add, 2 - Subtract, 3 - Divide, 4 - Multiply)
        Scanner sc = new Scanner(System.in);
        int number1, number2;
        double results = 0;
        int menuOption;

        do {
            System.out.println("Select option from the menu: \n" +
                    "1 - Add\n2 - Subtract\n3 - Divide\n4 - Multiply");
            menuOption = sc.nextInt();//3
        }while (menuOption < 1 || menuOption > 4);

        System.out.print("Enter number 1: ");
        number1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        number2 = sc.nextInt();

        if (menuOption == 1){
            results = number1 + number2;

        } else if (menuOption == 2) {
            results = number1 - number2;

        }else if (menuOption == 3) {

            while (number2 == 0){
                System.out.print("Number 2 cannot be zero. Please provide a " +
                        "different number. Enter number 2:");
                number2 = sc.nextInt();//6
            }
            results = number1 / number2;

        }else if (menuOption == 4) {
            results = number1 * number2;
        }

        System.out.println("Results: " + results);

    }
}
