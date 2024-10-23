package Chapter5;

public class MethodOverloading {
    public static void main(String[] args) {

        System.out.println("Sum: " + calculate(5.63F,52));
    }

    public static int calculate(int x, int y){
        return x + y;
    }
    public static double calculate(double a, double b){
        return a + b;
    }
    public static float calculate(float i, float j){
        return i + j;
    }

}
