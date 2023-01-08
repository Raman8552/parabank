package com.parabank.qa.util;

import java.util.ArrayList;

public class ReqLoanDataProviderData {

	public static ArrayList<Object[]> getData() {
		ExcelSheet excelsheet=new ExcelSheet("C:\\Users\\kaurr\\OneDrive\\Documents\\ParaBankingDomain\\src\\"
				+ "main\\java\\com\\parabank\\qa\\testdata\\RequestLoanExcelSheet.xlsx");
		
		ArrayList<Object[]> mylist= new ArrayList<Object[]>();
		for(int i=2; i< excelsheet.getRowCount("Sheet1");i++) {
		String LoanAmount = excelsheet.getCellData("Sheet1","LoanAmount", i);
		String DownPayment = excelsheet.getCellData("Sheet1","DownPayment", i);
		
	

		Object ob[]= {LoanAmount, DownPayment};
		mylist.add(ob);
		}
		return mylist;
		}
	
}
