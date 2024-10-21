package Chapter2.Exercise;

import javax.swing.*;
import java.util.Scanner;

public class CalculateProfit {
    public static void main(String[] args) {
        //Declare
        double revenue, costs, profit;
        Scanner sc = new Scanner(System.in);
        //Assign
//        System.out.print("Enter Total Costs: ");
//        costs = sc.nextDouble();
//        System.out.print("Enter Total Revenue: ");
//        revenue = sc.nextDouble();
        costs = Double.parseDouble(JOptionPane.showInputDialog("Enter Total Costs"));
        revenue = Double.parseDouble(JOptionPane.showInputDialog("Enter Total Revenue"));

        profit = revenue - costs;

        System.out.println("----------OUTPUT----------\n" +
                "Profit: " + profit);

    }
}
