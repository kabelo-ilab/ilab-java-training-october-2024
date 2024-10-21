package Chapter3;
/*The program should assign grade depending on the
* test mark the student received
* A 90 - 100, B 80 - 90, C 70 - 80, D 60 - 70, D- 50 - 60, E 40 - 50
* F less than 40*/
public class If_Else_if_Statement {
    public static void main(String[] args) {
        int testMark = 40;
        String grade = "None";

        if (testMark >= 90) {
            grade = "A";
        }else if(testMark >= 80){
            grade = "B";
        }else if(testMark >= 70){
            grade = "C";
        }else if(testMark >= 60){
            grade = "D";
        }else if(testMark >= 50){
            grade = "D-";
        }else if(testMark >= 40){
            grade = "E";
        }else if(testMark < 40){
            grade = "F";
        }

        System.out.println(grade);

    }
}
