package Chapter7;

import java.io.*;

public class ReadFromTextFile {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Kabelo Tlhape\\Music\\test\\Example 1.txt";
        File myFile = new File(filePath);
        try{
            FileReader reader = new FileReader(myFile);
            BufferedReader read = new BufferedReader(reader);
            //logic to read the file
            String line;
            line = read.readLine();//Java Training

            while(line != null){
                System.out.println(line);
                line = read.readLine();
            }

        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }catch (IOException e){
            System.out.println("Cannot read the file");
        }


    }
}
