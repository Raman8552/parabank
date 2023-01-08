package com.parabank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.parabank.qa.base.TestBase;

public class AccountsOverview extends TestBase{

	@FindBy (xpath = "//*[@id=\"accountTable\"]/thead/tr/th[1]") WebElement AccountTab;
	@FindBy (xpath = "//*[@id=\"accountTable\"]/thead/tr/th[2]") WebElement BalanceTab;
	@FindBy (xpath = "//*[@id=\"accountTable\"]/thead/tr/th[3]") WebElement	AvailableAmountTab;
	@FindBy (xpath = "//*[@id=\"accountTable\"]/tbody/tr[1]/td[1]/a") WebElement Accounttextlink;
	@FindBy (xpath = "//*[@id=\"accountTable\"]/tbody/tr[2]/td[1]/a")WebElement AccountinAccounts;

public AccountsOverview() {
	PageFactory.initElements(driver, this);
}

public String validateAccountsOverviewTitle() {
	return driver.getTitle();
}

public boolean validateAccountTab() {
	return AccountTab.isDisplayed();
}

public boolean validateBalanceTab() {
	return BalanceTab.isDisplayed();
}
public boolean validateAvailableAmountTab() {
	return AvailableAmountTab.isDisplayed();
}

public String validateAccounttextlink() {
	Accounttextlink.click();
	return driver.getTitle();
}
public String AccountinAccountID() {
	 return AccountinAccounts.getText();	
}
}

