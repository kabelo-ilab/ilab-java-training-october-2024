package Chapter7;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFromExcel {
    public static void main(String[] args) {
        String filePath = "src/resources/Student Results.xlsx";
        File myFile = new File(filePath);
        try {
            FileInputStream fileInput = new FileInputStream(myFile);
            XSSFWorkbook wb = new XSSFWorkbook(fileInput);
            XSSFSheet sheet = wb.getSheetAt(0);

            for (Row myRow : sheet){//read each row
                for (Cell myCell : myRow){//read each cell from current row
                    //check the data type of values on each cell
                    switch (myCell.getCellTypeEnum()){
                        case STRING :
                            System.out.print(myCell.getStringCellValue() + "\t\t\t");
                            break;
                        case NUMERIC:
                            System.out.print(myCell.getNumericCellValue() + "\t\t\t\t");
                            break;
                        case FORMULA:
                            System.out.print(myCell.getCellFormula() + "\t");
                        default:
                            System.out.println("Incorrect data type");
                    }
                }
                System.out.println();
            }
            fileInput.close();
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }catch (IOException e){
            System.out.println("Cannot read file");
        }


    }
}
