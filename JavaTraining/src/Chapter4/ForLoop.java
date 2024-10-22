package Chapter4;

public class ForLoop {
    public static void main(String[] args) {
        //display Hello world 5 times
        for(int count = 1;count <= 5;count++){
            System.out.println("Hello World");
        }
        System.out.println("---------------------------------------");
        //display Tuesday 4 times: 5, 6, 7, 8
        for (int count = 5; count < 9; count++){
            System.out.println("Tuesday");
        }


        System.out.println("---------------------------------------");
        //display Java 4 times: 5, 4, 3, 2
        for (int x = 5; x >= 2; x--){
            System.out.println("Java");
        }

        System.out.println("---------------------------------------");
        //display even numbers between 1 and 10 (2 - 9)
        for (int x = 2; x <= 10; x = x + 2){
            System.out.println(x);//2, 4, 6, 8
        }



    }
}
