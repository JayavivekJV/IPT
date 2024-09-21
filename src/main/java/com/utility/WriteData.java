package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {
	
	public static void main(String[] args) throws InvalidFormatException, IOException {
		
		  File file =  new File("D:\\Book1.xlsx");
		  
		  FileInputStream fileInput = new FileInputStream(file);
		  
		  Workbook book = new XSSFWorkbook(fileInput);
		  
		  book.createSheet("Students").createRow(0).createCell(0).setCellValue("NAME");
		  
		  book.getSheet("Students").getRow(0).createCell(1).setCellValue("EMP_NO");
		  
		  FileOutputStream fileOutput = new FileOutputStream(file);
		  
		  book.write(fileOutput);
		  
		  book.close();
		  
		  System.out.println("__________DONE_________");
		  
	}

}
