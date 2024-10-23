package Chapter7;

import java.io.File;
import java.io.PrintStream;

public class WriteToTextFile {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Kabelo Tlhape\\Music\\test\\Example 1.txt";
        File myFile = new File(filePath);
        try{
            myFile.createNewFile();//create a new file
            PrintStream pen = new PrintStream(myFile);
            pen.println("Java Training");
            pen.println("Today is Wednesday");
            pen.println("========================");
            pen.close();

        }catch (Exception e){
            System.out.println("File couldn't be created. \n" +
                    e.getMessage());
        }

    }
}
