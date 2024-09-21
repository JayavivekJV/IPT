package com.utility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelDataClown {
	
	public static String getParticularCell(int rows,int column) throws InvalidFormatException, IOException {
		
		File file =  new File("D:\\Book1.xlsx");
		
		Workbook book = new XSSFWorkbook(file);
		
		Sheet sheet = book.getSheetAt(0);
		
		Row row = sheet.getRow(rows);
		
		Cell cell = row.getCell(column);
		
		//DATAFORMATTER CLASS IT HELP FROM THE EACH CELL INTO STRING
		
		DataFormatter dataFormat = new DataFormatter();
		String testData = dataFormat.formatCellValue(cell);
		System.out.println(testData);
		return testData;
		
	//FOR CALLING STRING
		
//		String data = cell.getStringCellValue();
//		System.out.println(data);
		
		//FOR CALLING INTERGER
		
//		double numdata = cell.getNumericCellValue();
//		System.out.println(numdata);
		
	}
	private  static void getParticularRowMultipleCell() throws InvalidFormatException, IOException {
		
        File file =  new File("D:\\Book1.xlsx");
		
		Workbook book = new XSSFWorkbook(file);
		
		Sheet sheet = book.getSheetAt(0);
		
		int noOfRows = sheet.getLastRowNum();
		System.out.println("No Of Rows : "+noOfRows);
		
		Short noOfCells = sheet.getRow(0).getLastCellNum();
		System.out.println("No Of Cells : "+noOfCells );
		
		Row row = sheet.getRow(2);
		
		for (int i = 0; i < noOfCells; i++) {
			Cell cell = row.getCell(i);
			DataFormatter dataFormat = new DataFormatter();
			String data = dataFormat.formatCellValue(cell);
			System.out.println(data);
		}
		
		
	}
	private static void getAllData() throws InvalidFormatException, IOException {
		
		  File file =  new File("D:\\Book1.xlsx");
			
			Workbook book = new XSSFWorkbook(file);
			
			Sheet sheet = book.getSheetAt(0);
			
			int noOfRows = sheet.getLastRowNum();
			System.out.println("No Of Rows : "+noOfRows);
			
			Short noOfCells = sheet.getRow(0).getLastCellNum();
			System.out.println("No Of Cells : "+noOfCells );
			
			for (int i = 0; i <= noOfRows; i++) {
				    Row row = sheet.getRow(i);
			
					for (int  j= 0; j < noOfCells; j++) {
						Cell cell = row.getCell(j);
						DataFormatter dataFormat = new DataFormatter();
						String data = dataFormat.formatCellValue(cell);
						System.out.println(data);
			}
			}
		 
	}
	
	public static void main(String[] args) throws InvalidFormatException, IOException {
		getAllData();
	}

}
