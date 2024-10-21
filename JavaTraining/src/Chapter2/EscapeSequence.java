package Chapter2;

import javax.swing.*;

public class EscapeSequence {
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

        //Use
        JOptionPane.showMessageDialog(null,
                "Name: " + strName + "\nAge: " + age +
                "\nWage: " + wage + "\nSalary: " + salary +
                "\nIs Contract Worker? " + isContractor +
                "\nContract Type: " + contractType);

        System.out.println("Name\tAge\t\tWage\tSalary\tContract?\tType");
        System.out.println("-------------------------------------------");
        System.out.println(strName + "\t" + age + "\t\t" + wage + "\t" +
                salary + "\t" + isContractor + "\t\t" + contractType);


    }
}
