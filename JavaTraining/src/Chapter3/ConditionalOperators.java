package Chapter3;

public class ConditionalOperators {
    public static void main(String[] args) {
        int testMark = 15;
        //single if statement
        System.out.println("------------Single if statement------------");
        if(testMark > 65){
            System.out.println("Pass");
        }

        //only works when there is only one statement to execute
        if(testMark > 75)
            System.out.println("Pass with A Grade");


        //double if-else statement
        System.out.println("------------Double if-else statement------------");
        if(testMark >= 65){
            //true clause
            System.out.println("Pass");
        }else{
            //false clause
            System.out.println("Failed");
        }


    }
}
