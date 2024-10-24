package Chapter7;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteToExcel {
    public static void main(String[] args) {
        String filePath = "src/resources/Student Results.xlsx";

        try {
            //create file output stream
            OutputStream fileOutput = new FileOutputStream(filePath);
            //create a workbook
            XSSFWorkbook stResultsWb = new XSSFWorkbook();
            //create a spreadsheet
            XSSFSheet sheet = stResultsWb.createSheet("2024 Internship");
            //create a header row
            XSSFRow header = sheet.createRow(0);
            header.createCell(0).setCellValue("Student Name");
            header.createCell(1).setCellValue("Test Mark");
            header.createCell(2).setCellValue("Assignment 1");
            header.createCell(3).setCellValue("Assignment 2");
            header.createCell(4).setCellValue("Remarks");
            //create first row of data
            XSSFRow row1 = sheet.createRow(1);
            row1.createCell(0).setCellValue("David");
            row1.createCell(1).setCellValue(65);
            row1.createCell(2).setCellValue(85);
            row1.createCell(3).setCellValue(70);
            row1.createCell(4).setCellValue("Very Good");
            //create second row of data
            XSSFRow row2 = sheet.createRow(2);
            row2.createCell(0).setCellValue("Thabo");
            row2.createCell(1).setCellValue(65);
            row2.createCell(2).setCellValue(95);
            row2.createCell(3).setCellValue(80);
            row2.createCell(4).setCellValue("Excellent");
            //create third row of data
            XSSFRow row3 = sheet.createRow(3);
            row3.createCell(0).setCellValue("Carol");
            row3.createCell(1).setCellValue(70);
            row3.createCell(2).setCellValue(65);
            row3.createCell(3).setCellValue(88);
            row3.createCell(4).setCellValue("Outstanding");
            //create first row of data
            XSSFRow row4 = sheet.createRow(4);
           row4.createCell(0).setCellValue("Mike");
            row4.createCell(1).setCellValue(78);
            row4.createCell(2).setCellValue(91);
            row4.createCell(3).setCellValue(68);
            row4.createCell(4).setCellValue("Good");

            stResultsWb.write(fileOutput);
            fileOutput.close();
            stResultsWb.close();

        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }catch (IOException e){
            System.out.println("Couldn't write to the file");

        }

    }
}
