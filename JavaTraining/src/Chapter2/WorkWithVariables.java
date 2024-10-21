package Chapter2;

public class WorkWithVariables {
    public static void main(String[] args) {
        //Declare - declare variables
        int age;
        double wage;
        float salary;
        boolean isContractor;
        char contractType;
        String strName;

        //Assign - assign values to the variables (=)
        age = 25;
        wage = 350.65;
        salary = 15000.85F;
        isContractor = true;
        contractType = 'P';
        strName = "Kabelo";

        //Use / Consume - use the values stored inside the variables
        System.out.println("Name: " + strName);
        System.out.println("Age: " + age);
        System.out.println("Wage: " + wage);
        System.out.println("Is Contract Worker? " + isContractor);
        System.out.println("Contract Type: " + contractType);
        System.out.println("Salary: " + salary);

    }
}
