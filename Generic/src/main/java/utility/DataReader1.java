package utility;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataReader1 {
    //FILE_NAME
//    public static List<String> readExcelFile(String pathExcel) throws IOException {
//        List<String> list = new ArrayList<>();
//        try {
//            FileInputStream inputStream = new FileInputStream(new File(pathExcel));
//            Workbook workbook = new XSSFWorkbook(inputStream);
//            Sheet dataTypeSheet = workbook.getSheetAt(0);
//            Iterator<Row> rowIterator = dataTypeSheet.iterator();
//            while (rowIterator.hasNext()) {
//                Row currentRow = rowIterator.next();
//                Iterator<Cell> cellIterator = currentRow.iterator();
//                while (cellIterator.hasNext()) {
//                    Cell currentCell = cellIterator.next();
//
//                    if (currentCell.getCellType() == CellType.STRING) {
//                        System.out.print(currentCell.getStringCellValue() + " ");
//                        currentCell.getStringCellValue();
//                        list.add(currentCell.getStringCellValue());
//                    } else if (currentCell.getCellType() == CellType.NUMERIC) {
//                        System.out.print(currentCell.getNumericCellValue());
//                        currentCell.getStringCellValue();
//                        list.add(currentCell.getStringCellValue()); } }
//                System.out.println(); }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//            System.out.println("File not found Exception");
//        } catch (IOException e1) {
//            e1.printStackTrace();
//            System.out.println("Input Output Exception"); }
//        return list; }
}
