package com.parabank.qa.util;

import java.util.ArrayList;

public class DataProviderData {

public static ArrayList<Object[]> getData() {
ExcelSheet excelsheet=new ExcelSheet("C:\\Users\\kaurr\\OneDrive\\Documents\\ParaBankingDomain\\src\\main\\java\\com\\parabank\\qa\\util\\DataProviderData.java");
ArrayList<Object[]> mylist= new ArrayList<Object[]>();
for(int i=2; i< excelsheet.getRowCount("RegistrationDataExcelSheet");i++) {
String ftname = excelsheet.getCellData("RegistrationDataExcelSheet","FirstName", i);
String lastname = excelsheet.getCellData("RegistrationDataExcelSheet","LastName", i);
String address = excelsheet.getCellData("RegistrationDataExcelSheet","Address", i);
String city = excelsheet.getCellData("RegistrationDataExcelSheet","City", i);
String state = excelsheet.getCellData("RegistrationDataExcelSheet","State", i);
String zipcode = excelsheet.getCellData("RegistrationDataExcelSheet","ZipCode", i);
String phone = excelsheet.getCellData("RegistrationDataExcelSheet","Phone", i);
String ssn = excelsheet.getCellData("RegistrationDataExcelSheet","SSN", i);
String username = excelsheet.getCellData("RegistrationDataExcelSheet","Username", i);
String password = excelsheet.getCellData("RegistrationDataExcelSheet","Password", i);
String confirm = excelsheet.getCellData("RegistrationDataExcelSheet","Confirm", i);

Object ob[]= {ftname,lastname,address,city,state,zipcode,phone,ssn,username,password,confirm};
mylist.add(ob);
}
return mylist;
}

}
