package org.example;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Excelreader {
    public static String getCellData(String filePath, String sheetName, int row, int col) throws IOException {
        FileInputStream fis = new FileInputStream(new File(filePath));
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheet(sheetName);
        Row sheetRow = sheet.getRow(row);
        Cell cell = sheetRow.getCell(col);
        String data = cell.getStringCellValue();
        workbook.close();
        fis.close();
        return data;
    }
}
