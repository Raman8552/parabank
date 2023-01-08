package com.parabank.qa.util;

import java.util.ArrayList;

public class BillPayDataProviderData {

	public static ArrayList<Object[]> getData() {
		ExcelSheet excelsheet=new ExcelSheet("C:\\Users\\kaurr\\OneDrive\\Documents\\ParaBankingDomain\\src\\main\\java\\com\\parabank\\qa\\testdata\\BillPayExcelSheet.xlsx");
		
	
		ArrayList<Object[]> mylist= new ArrayList<Object[]>();
		for(int i=2; i< excelsheet.getRowCount("Sheet1");i++) {
		String payeename = excelsheet.getCellData("Sheet1","PayeeName", i);
		String address = excelsheet.getCellData("Sheet1","Address", i);
		String city = excelsheet.getCellData("Sheet1","City", i);
		String state = excelsheet.getCellData("Sheet1","State", i);
		String zipcode = excelsheet.getCellData("Sheet1","ZipCode", i);
		String phone = excelsheet.getCellData("Sheet1","Phone", i);
		String account = excelsheet.getCellData("Sheet1","Account", i);
		String verifyaccount = excelsheet.getCellData("Sheet1","Verify Account", i);
		String amount = excelsheet.getCellData("Sheet1","Amount", i);
		String fromaccount = excelsheet.getCellData("Sheet1","From Account", i);

		Object ob[]= {payeename,address,city,state,zipcode,phone,account,verifyaccount,amount,fromaccount};
		mylist.add(ob);
		}
		return mylist;
		}
	
	
}
