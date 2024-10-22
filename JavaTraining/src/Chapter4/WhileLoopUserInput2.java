package Chapter4;

import java.util.Scanner;

public class WhileLoopUserInput2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strName;
        //initialize the lcv
        System.out.print("Enter name: ");
        strName = sc.next();
        //enter any name but Kabelo, Mike, Carol
        while (strName.equals("Kabelo") || strName.equals("Mike") || strName.equals("Carol")){
            System.out.print("Name is already taken. Please provide a different name: ");
            strName = sc.next();
        }
        System.out.println("Thank you, " + strName);

    }
}
