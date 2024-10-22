package Chapter4;


import Chapter5.VoidMethods;

public class DoWhileLoop {
    public static void main(String[] args) {
        //display hello world 3 times
        //declare and initialize the lcv
        int count = 1;

        do {
            System.out.println(count + " - Hello World");
            count++;
        }while(count <= 3);
    }
}
