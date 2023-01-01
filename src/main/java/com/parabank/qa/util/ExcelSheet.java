package com.parabank.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet {
	static Workbook book;
	static FileInputStream fis;
	public static void main(String[] args) {
		Object[][] obj = ExcelSheet.getData();
		System.out.println(Arrays.asList(obj));
	}
	public static Object[][] getData(){
		try {
		fis = new FileInputStream("C:\\Users\\kaurr\\OneDrive\\Documents\\ParaBankingDomain\\src\\main\\java\\com\\parabank\\qa\\testdata\\RegisrationDataExcelSheet.xlsx");
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(fis);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		Sheet sheet = book.getSheet("RegistrationDataExcelSheet");
		Object[][] obj = new Object[43][11];
		for (int i = 0; i< 43; i++ ) {
			for (int k = 0; k< 11; k++) {
				obj[i][k]= sheet.getRow(i+1).getCell(k).toString();
			}
		}
		return obj;
	}

}
