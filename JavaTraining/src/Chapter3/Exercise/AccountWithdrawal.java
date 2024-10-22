package Chapter3.Exercise;

import java.util.Scanner;

//Exercise 5
public class AccountWithdrawal {
    public static void main(String[] args) {
        double currentBal, withdrawalAmt, newBalance = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter current balance: ");
        currentBal = sc.nextDouble();
        System.out.print("Enter amount to withdraw: ");
        withdrawalAmt = sc.nextDouble();

        if (withdrawalAmt > currentBal){
            System.out.println("Withdrawal denied");
        }else{
            newBalance = currentBal - withdrawalAmt;

            if (newBalance < 150){
                System.out.println("Balance below R150");
            }
            System.out.println("New Balance: " + newBalance);

        }






    }
}
