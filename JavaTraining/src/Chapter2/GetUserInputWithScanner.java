package Chapter2;

import java.util.Scanner;

/*This class uses a Scanner class to get input from
* the user*/
public class GetUserInputWithScanner {
    public static void main(String[] args) {
        //Declare
        int age;
        double wage;
        float salary;
        boolean isContractor = true;
        char contractType;
        String strName;
        Scanner input = new Scanner(System.in);

        //assign - get input from the user
        System.out.print("Enter Name: ");
        strName = input.next();
        System.out.print("Enter Age: ");
        age = input.nextInt();
        System.out.print("Enter Wage: ");
        wage = input.nextDouble();
        System.out.print("Enter Salary: ");
        salary = input.nextFloat();
        System.out.print("Enter Contract Type: ");
        contractType = input.next().charAt(0);

        //Use / Consume
        System.out.println("----------OUTPUT----------");
        System.out.println("Name: " + strName);
        System.out.println("Age: " + age);
        System.out.println("Wage: " + wage);
        System.out.println("Salary: " + salary);
        System.out.println("Is Contract Worker? : " + isContractor);
        System.out.println("Contract Type : " + contractType);

    }
}
