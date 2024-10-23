package Chapter6;

public class RetrieveArrayElements {
    public static void main(String[] args) {
        //dataType[] arrayName = {initial values}
        int[] arNumbers = {20, 51, 5, 47, 19, 25};
        String[] arHobbies = {"Soccer", "Tennis", "Chess"};
                            //  0          1         2        3
        double[] arPrices = {15.99, 25.90, 10.50, 19.30,75.99, 2.98, 12.50, 39.20};
                            //0      1       2      3 - index
                            //1      2       3      4 - length / count
        char[] arLetters = {'M','T','W','t','f'};
        //declare an empty array
        int[] arEvenNumbers = new int[8];//8, 4, 22, 64, 18,
                                        //0   1   2   3   4

        arEvenNumbers[0] = 8;
        arEvenNumbers[1] = 4;
        arEvenNumbers[2] = 6;
        arEvenNumbers[3] = 22;
        arEvenNumbers[4] = 64;
        arEvenNumbers[5] = 18;
        arEvenNumbers[6] = 10;
        arEvenNumbers[7] = 30;

        //display array elements
        System.out.println("======== Even Numbers (" + arEvenNumbers.length + " elements)========");
        for(int x = 0; x <= arEvenNumbers.length - 1;x++){ //x <= 7 - 1
            System.out.print(arEvenNumbers[x] + " ");//8 4 22
        }
        System.out.println();
        System.out.println("========== Hobbies (" + arHobbies.length + " elements)==========");
        for (int i = 0; i < arHobbies.length; i++){//i < 4
            System.out.println(arHobbies[i]);
        }

        System.out.println("========== Prices (" + arPrices.length + " elements)==========");
        int count = 0;
        while (count < arPrices.length){ //count < 4
            System.out.print(arPrices[count] + "  ");//0, 1, 2, 3, 4
            count++;
        }
        System.out.println("\n========== Numbers (" + arNumbers.length + " elements)==========");
        //use enhanced for loop / array loop
        for(int n : arNumbers){
            System.out.print(n + " ");
        }

        System.out.println("\n========== Letters (" + arLetters.length + " elements)==========");
        for(char l : arLetters){
            System.out.print(l + " ");
        }


    }
}
