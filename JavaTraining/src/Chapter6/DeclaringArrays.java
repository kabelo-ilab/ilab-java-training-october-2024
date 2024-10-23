package Chapter6;

/*An array is a variable that can store multiple
* values of the same data type*/
public class DeclaringArrays {
    public static void main(String[] args) {
        //dataType[] arrayName = {initial values}
        int[] arNumbers = {20, 51, 5, 47, 19, 25};
        String[] arHobbies = {"Soccer", "Tennis", "Chess"};
        double[] arPrices = {15.99, 25.90, 10.50, 19.20,17,49};
        char[] arLetters = {'M','T','W','t','f'};
        //declare an empty array
        int[] arEvenNumbers = new int[7];//8, 4, 22, 64, 18, 6, 10
                                        //0   1  2   3   4   5  6  - index

        //Assign
        arEvenNumbers[0] = 8;
        arEvenNumbers[1] = 4;
        arEvenNumbers[5] = 6;
        arEvenNumbers[2] = 22;
        arEvenNumbers[3] = 64;
        arEvenNumbers[4] = 18;
        arEvenNumbers[6] = 10;

        //Use / Consume
        System.out.println(arEvenNumbers[6]);//10
        System.out.println(arEvenNumbers[0]);//8
        System.out.println(arEvenNumbers[2]);//22



    }
}
