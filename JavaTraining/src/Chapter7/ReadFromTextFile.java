package Chapter7;


import java.io.*;

public class ReadFromTextFile {
    public static void main(String[] args) {
        String filePath = "src/resources/write example.txt";
        File myFile = new File(filePath);
        try {
            FileReader reader = new FileReader(myFile);
            BufferedReader read = new BufferedReader(reader);
            String line = read.readLine();
            while (line != null){
                System.out.println(line);
                line = read.readLine();
            }

        }catch (FileNotFoundException e){
            System.out.println("File doesn't exist. " + myFile.getName());
        }catch (IOException e){
            System.out.println("Couldn't read from the file");
        }




    }
}
