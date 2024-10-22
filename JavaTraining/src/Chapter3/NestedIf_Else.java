package Chapter3;
/*
* The program should check if the student gets a test mark of
* 50 and above, if they do, it should continue to check if
* they get a mark greater than 59 for assignment 1, if they do,
* it should continue to check if they get a mark of 55 and above
*  for assignment 2. If they do not achieve 55 and above, check if
* they have at least 75% attendance
 */
public class NestedIf_Else {
    public static void main(String[] args) {
        int testMark = 55;
        int assignment1 = 64, assignment2 = 45;
        int attendance = 77;

        if (testMark >= 50){//A
            //true
            if (assignment1 > 59){//B
                //true
                if (assignment2 >= 55){//C
                    //true
                    System.out.println("(1) - Well done. You passed all your assessments");//1
                }else{
                    if (attendance >= 75){
                        System.out.println("(2) - Promoted");//2
                    }else{
                        System.out.println("(3) - You failed assignment 2");//3
                    }

                }//C-C
            }else{
                System.out.println("(4) - You failed assignment 1. " +
                        "You cannot submit assignment 2");//4
            }//B-B
        }else{
            System.out.println("(5) - You failed the test");//5
        }//A-A
    }

}
