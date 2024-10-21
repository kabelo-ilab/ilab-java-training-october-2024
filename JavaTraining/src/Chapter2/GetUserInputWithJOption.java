package Chapter2;

import javax.swing.*;

public class GetUserInputWithJOption {
    public static void main(String[] args) {
        //Declare
        int age;
        double wage;
        float salary;
        boolean isContractor = true;
        char contractType;
        String strName;
        //Assign - using the JOptionPane class
        strName = JOptionPane.showInputDialog("Enter Name");
        age = Integer.parseInt(JOptionPane.showInputDialog("Enter Age"));
        wage = Double.parseDouble(JOptionPane.showInputDialog("Enter Wage"));
        salary = Float.parseFloat(JOptionPane.showInputDialog("Enter Salary"));
        contractType = JOptionPane.showInputDialog("Contract Type").charAt(0);

        //consume
        JOptionPane.showMessageDialog(null,"Name: " + strName);
        JOptionPane.showMessageDialog(null,"Age: " + age);

    }
}
