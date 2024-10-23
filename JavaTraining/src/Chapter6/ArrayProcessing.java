package Chapter6;

public class ArrayProcessing {
    public static void main(String[] args) {
        String[] arHobbies = {"Soccer", "Tennis", "Chess", "Hiking", "Golf"};
        double[] arPrices = {15.99, 25.90, 10.50, 19.30,75.99, 2.98, 12.50, 39.20};
        int[] arNumbers = {20, 51, 5, 47, 19, 25, 12, 28, 16, 33, 101, 82, 97, 55};

        //increase the prices by 10%

        System.out.println("Old Price\tNew Price");
        System.out.println("==========================");

        for(double p : arPrices){
            System.out.println(p + "\t\t" + (p + (p * 0.15)));
        }
        System.out.println("================================");
        //display number of letters in each hobby
        for(String h : arHobbies){
            System.out.println(h + " has " + h.length() + " letters");
        }
        //display even numbers using modulus operator (%)
        //if x % 2 == 0
        //3, 4, 1, 9, 8
        //0  1  2  3  4
        System.out.println("===============All Numbers=================");
        for(int x = 0; x <= arNumbers.length - 1; x++){
                System.out.print(arNumbers[x] + " ");
        }
        System.out.println("\n===============Even Numbers=================");
        for(int x = 0; x <= arNumbers.length - 1; x++){
            if (arNumbers[x] % 2 == 0){
                System.out.print(arNumbers[x] + " ");
            }
        }


    }
}
