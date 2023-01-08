package com.parabank.qa.util;

import java.util.ArrayList;

public class FMLIDataProviderData {

	public static ArrayList<Object[]> getData() {
		ExcelSheet excelsheet=new ExcelSheet("C:\\Users\\kaurr\\OneDrive\\Documents\\ParaBankingDomain\\src\\"
				+ "main\\java\\com\\parabank\\qa\\testdata\\FMLIdatasheet.xlsx");
		
		ArrayList<Object[]> mylist= new ArrayList<Object[]>();
		for(int i=2; i< excelsheet.getRowCount("Sheet1");i++) {
		String ftname = excelsheet.getCellData("Sheet1","FirstName", i);
		String lastname = excelsheet.getCellData("Sheet1","LastName", i);
		String address = excelsheet.getCellData("Sheet1","Address", i);
		String city = excelsheet.getCellData("Sheet1","City", i);
		String state = excelsheet.getCellData("Sheet1","State", i);
		String zipcode = excelsheet.getCellData("Sheet1","ZipCode", i);
		String ssn = excelsheet.getCellData("Sheet1","SSN", i);
	

		Object ob[]= {ftname,lastname,address,city,state,zipcode,ssn};
		mylist.add(ob);
		}
		return mylist;
		}
}
