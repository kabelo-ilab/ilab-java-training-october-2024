package Chapter4;

import java.util.Scanner;

/*The program should accept numbers from the user, add them together and
* display their sum / total. The program should stop when the user
* enters zero (0)*/
public class WhileLoopUserInput {
    public static void main(String[] args) {
        int number, sum = 0;
        Scanner sc = new Scanner(System.in);

        //initialize the lcv
        System.out.print("Enter a number to add: ");
        number = sc.nextInt();//4
        //test the lcv
        while (number != 0 && number > 0){
            sum = sum + number;
            //change the value of lcv
            System.out.print("Enter a number to add: ");
            number = sc.nextInt();
        }

        System.out.println("Sum: " + sum);

    }
}
