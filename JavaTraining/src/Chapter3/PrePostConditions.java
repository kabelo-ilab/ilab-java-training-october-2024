package Chapter3;

public class PrePostConditions {
    public static void main(String[] args) {
        //Declare
        int age;
        //assign
        age = 25;
        //Use

        System.out.println("Value of age at the start of execution: " + age);//25
        System.out.println("Change the value of age before use: " + --age);//24
        System.out.println("Change the value of age after being used: " + age--);//24
        System.out.println("Current value of age: " + age);//23
    }
}
