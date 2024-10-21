package Chapter2;

public class WorkWithVariables2 {
    public static void main(String[] args) {
        //declare and initialize (=)
        int age = 25;
        double wage = 370.63;
        float salary = 20000.54F;
        boolean isContractor = true;
        String strName = "Kabelo";
        char contractType = 'F';

        //Use / Consume - use the values stored inside the variables
        System.out.println("Name: " + strName);
        System.out.println("Age: " + age);
        System.out.println("Wage: " + wage);
        System.out.println("Salary: " + salary);
        System.out.println("Is Contract Worker? : " + isContractor);
        System.out.println("Contract Type : " + contractType);

    }
}
