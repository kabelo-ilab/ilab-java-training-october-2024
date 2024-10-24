package Chapter7;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class WriteToTextFile {
    public static void main(String[] args) {
    //file path
        String filePath = "src/resources/write example.txt";

        File myFile = new File(filePath);
        try{
            myFile.createNewFile();
             PrintStream pen = new PrintStream(myFile);
             pen.println("iLAB Training");
             pen.println("Yesterday was Wednesday");
             pen.println("Today is Thursday");
             pen.println("24 - Oct - 2024");
             pen.close();
        }catch (IOException e){
            System.out.println("Couldn't write to a file. \n" + e.getMessage() +
                    "\nFile Path: " + myFile.getPath());
        }


    }
}
