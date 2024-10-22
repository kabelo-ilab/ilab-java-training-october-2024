package Chapter4;

public class WhileLoop {
    public static void main(String[] args) {
        /*declare and initialize the loop control variable (lcv)
        outside the loop
         */
        //display Hello World 5 times
        int count = 1;
        //test the loop control variable with the while loop
        while(count <= 5){
            System.out.println("Hello World");
            //change the value of the lcv
            count++;
        }//2, 3, 4, 5, 6

        System.out.println("---------------------------------");
        //display Java 3 times
        count = 1;
        while (count <= 3){//6
            System.out.println("Java");
            count++;
        }

    }
}
