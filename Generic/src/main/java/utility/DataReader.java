package utility;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataReader {



    public static HSSFWorkbook wb = null;
    public static HSSFSheet sheet = null;
    public static Cell cell = null;
    public static FileOutputStream fio = null;
    public static int numberOfRows;
    public static int numberOfCol;
    public static int rowNum;
    public static HSSFWorkbook wbook = null;



//    HSSFWorkbook wb = null;
//    HSSFSheet sheet = null;
//    Cell cell = null;
//    FileOutputStream fio = null;
//    int numberOfRows, numberOfCol, rowNum;
//
//    public String[][] fileReader1(String path,int sheetIndex) throws IOException {
//        String[][] data = {};
//        File file = new File(path);
//        FileInputStream fis = new FileInputStream(file);
//        wb = new HSSFWorkbook(fis);
//        sheet = wb.getSheetAt(sheetIndex);
//        numberOfRows = sheet.getLastRowNum();
//        numberOfCol = sheet.getRow(0).getLastCellNum();
//        data = new String[numberOfRows + 1][numberOfCol + 1];
//
//        for (int i = 1; i < data.length; i++) {
//            HSSFRow rows = sheet.getRow(i);
//            for (int j = 0; j < numberOfCol; j++) {
//                HSSFCell cell = rows.getCell(j);
//                String cellData = getCellValue(cell);
//                data[i][j] = cellData;
//            }
//        }
//        return data;
//    }
//
//    public String[] fileReader2(String path, int sheetIndex) throws IOException {
//        String[] data = {};
//        File file = new File(path);
//        FileInputStream fis = new FileInputStream(file);
//        wb = new HSSFWorkbook(fis);
//        sheet = wb.getSheetAt(sheetIndex);
//        numberOfRows = sheet.getLastRowNum();
//        numberOfCol = sheet.getRow(0).getLastCellNum();
//        data = new String[numberOfRows + 1];
//
//        for (int i = 1; i < data.length; i++) {
//            HSSFRow rows = sheet.getRow(i);
//            for (int j = 0; j < numberOfCol; j++) {
//                HSSFCell cell = rows.getCell(j);
//                String cellData = getCellValue(cell);
//                data[i] = cellData;
//            }
//        }
//        return data;
//    }
//
//    public String getCellValue(HSSFCell cell) {
//        Object value = null;
//
//        int dataType = cell.getCellType();
//        switch (dataType) {
//            case HSSFCell.CELL_TYPE_NUMERIC:
//                value = cell.getNumericCellValue();
//                break;
//            case HSSFCell.CELL_TYPE_STRING:
//                value = cell.getStringCellValue();
//                break;
//            case HSSFCell.CELL_TYPE_BOOLEAN:
//                value = cell.getBooleanCellValue();
//                break;
//        }
//        return value.toString();
//
//    }

    public void writeBack(String value) throws IOException {
        wb = new HSSFWorkbook();
        sheet = wb.createSheet();
        Row row = sheet.createRow(rowNum);
        row.setHeightInPoints(10);

        fio = new FileOutputStream(new File("ExcelFile.xls"));
        wb.write(fio);
        for (int i = 0; i < row.getLastCellNum(); i++) {
            row.createCell(i);
            cell.setCellValue(value);
        }
        fio.close();
        wb.close();
    }
    /**
     * This method is to read Excel file based on sheet Index Number
     *
     *
     *
     *
     */
//FILE_NAME
    public static List<String> readExcelFile(String pathExcel) {
        List<String> list = new ArrayList<>();

        try {
            FileInputStream inputStream = new FileInputStream(new File(pathExcel));
            Workbook workbook = new XSSFWorkbook(inputStream);
            Sheet dataTypeSheet = workbook.getSheetAt(0);
            Iterator<Row> rowIterator = dataTypeSheet.iterator();
            while (rowIterator.hasNext()) {
                Row currentRow = rowIterator.next();
                Iterator<Cell> cellIterator = currentRow.iterator();
                while (cellIterator.hasNext()) {
                    Cell currentCell = cellIterator.next();

                    if (currentCell.getCellType() == CellType.STRING) {
                        System.out.print(currentCell.getStringCellValue() + " ");
                        currentCell.getStringCellValue();
                        list.add(currentCell.getStringCellValue());
                    } else if (currentCell.getCellType() == CellType.NUMERIC) {
                        System.out.print(currentCell.getNumericCellValue());
                        currentCell.getStringCellValue();
                        list.add(currentCell.getStringCellValue());
                    }

                }
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found Exception");

        } catch (IOException e1) {
            e1.printStackTrace();
            System.out.println("Input Output Exception");
        }
        return list;
    }
    static Workbook book;
    static Sheet sheet1;

// public static String path="C:/Users/ssbra/Desktop/New Microsoft Office Excel Worksheet.xlsx";

    public static Object[][] fileReader3(String sheetName,String pathName) throws IOException, InvalidFormatException {
// String[][] data1 = {};
        File file = new File(pathName);

        book = WorkbookFactory.create(file);
        sheet1 = book.getSheet(sheetName);
// numberOfRows = sheet.getLastRowNum();
// numberOfCol = sheet.getRow(0).getLastCellNum();

        Object[][] data1 = new Object[sheet1.getLastRowNum()][sheet1.getRow(0).getLastCellNum()];

        for (int i = 0; i < sheet1.getLastRowNum(); i++) {
// HSSFRow rows = sheet.getRow(i);
            for (int j = 0; j < sheet1.getRow(0).getLastCellNum(); j++) {
// HSSFCell cell = rows.getCell(j);
//String cellData = getCellValue(cell);
                data1[i][j] = sheet1.getRow(i + 1).getCell(j).toString();
//System.out.println(cellData);
            }

        }

        return data1;
    }


}
