package Chapter3;

public class TernaryOperator {
    public static void main(String[] args) {
        int testMark = 50;
        String results = "None";
        String grade = "None";
        String symbol = "D";
//
//        if (testMark >= 60){
//            results = "Pass";
//        }else{
//            results = "Fail";
//        }
        //variable = condition ? valueWhenTrue : valueWhenFalse
        results = (testMark >= 60) ? "Pass" : "Fail";

//        if (testMark >= 80){
//            System.out.println("Pass with Distinction");
//        }else{
//            System.out.println("Better luck next time");
//        }

        System.out.println(testMark >= 80 ? "Pass with Distinction" :
                "Better luck next time");

//        if (symbol == "A"){
//            grade = "Outstanding";
//        }else if (symbol == "B"){
//            grade = "Excellent";
//
//        }else if (symbol == "C"){
//            grade = "Good";
//        }else{
//            grade = "Try again";
//        }

        grade = (symbol == "A") ? "Outstanding" :
                (symbol == "B") ? "Excellent" :
                        (symbol == "C") ? "Good" : "Try again";


        System.out.println("Results: " + results);
        System.out.println("Symbol: " + symbol);
        System.out.println("Grade: " + grade);
    }
}
