package com.ibm.commerce.cmc.ui.catalogs.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ibm.commerce.cmc.base.TestBase;
import com.ibm.commerce.cmc.ui.utils.TestUtil;

public class UnassignedCatalogEntriesPage extends TestBase {
	
	public UnassignedCatalogEntriesPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[contains(text(),'Unassigned Catalog Entries')]")
	WebElement unassignedCatalogEntriesinExplorerView;
	
	//html/body/app-root/div/app-search-result/div/div[2]/div/p
	@FindBy(xpath="//h3")
	WebElement pageHeader;
	//html/body/app-root/div/app-unassigned-cat-entries/div/div[2]/div/h3
	
	
	
	@FindBy(xpath="//ibm-table//thead/tr/th[1]/button/span[contains(text(), 'Type')]")
	WebElement column_Type;
	
	
	@FindBy(xpath="//ibm-table//thead/tr/th[2]/button//ibm-dropdown//span[contains(text(), 'Store')]")
	WebElement column_Store;
	
	@FindBy(xpath="//ibm-table//thead/tr/th[3]/button/span[contains(text(), 'Code')]")
	WebElement column_Code;
	
	@FindBy(xpath="//ibm-table//thead/tr/th[4]/button/span[contains(text(), 'Name')]")
	WebElement column_Name;
	
	@FindBy(xpath="//ibm-table//thead/tr/th[5]/button/span[contains(text(), 'Thumbnail')]")
	WebElement column_Thumbnail;
	
	@FindBy(xpath="//ibm-table//thead/tr/th[6]/button/span[contains(text(), 'Display to Customer')]")
	WebElement column_DisplayToCustomer;
	
	@FindBy(xpath="//ibm-table//thead/tr/th[7]/button/span[contains(text(), 'Buyable')]")
	WebElement column_Buyable;
	
	@FindBy(xpath="//ibm-table//thead/tr/th[8]/button/span[contains(text(), 'Manufacturer Part Number')]")
	WebElement column_ManufacturerPartNumber;
	
	@FindBy(xpath="//ibm-table//thead/tr/th[9]/button/span[contains(text(), 'Manufacturer Name')]")
	WebElement column_ManufacturerName;
	
	
	
	public void clickOnUnassignedCatalogEntriesinExplorerView() {
		TestUtil.clickOnElement(unassignedCatalogEntriesinExplorerView);
	}
	
	public String getPageHeading() {
		//return pageHeader.getText();
		return TestUtil.getElementText(pageHeader);
		
	}
	
	public boolean isTypeColumnExists() {
		return TestUtil.isElementDisplayed(column_Type);
	}
	
	
	public boolean isTypeColumnClickable() {
		return TestUtil.isClickable(column_Type);
	}
	
	public boolean isStoreColumnExists() {
		return TestUtil.isElementDisplayed(column_Store);
	}
	
	
	public boolean isStoreColumnClickable() {
		return TestUtil.isClickable(column_Store);
	}
	
	
	public boolean isCodeColumnExists() {
		return TestUtil.isElementDisplayed(column_Code);
	}
	
	public boolean isCodeColumnClickable() {
		return TestUtil.isClickable(column_Code);
	}
	
	public boolean isNameColumnExists() {
		return TestUtil.isElementDisplayed(column_Name);
	}
	
	public boolean isNameColumnClickable() {
		return TestUtil.isClickable(column_Name);
	}
	
	public boolean isThumbnailColumnExists() {
		return TestUtil.isElementDisplayed(column_Thumbnail);
	}
	
	public boolean isThumbnailColumnClickable() {
		return TestUtil.isClickable(column_Thumbnail);
	}
	
	
	public boolean isDisplayToCustomerColumnExists() {
		return TestUtil.isElementDisplayed(column_DisplayToCustomer);
	}
	
	public boolean isDisplayToCustomerColumnClickable() {
		return TestUtil.isClickable(column_DisplayToCustomer);
	}
	
	public boolean isBuyableColumnExists() {
		return TestUtil.isElementDisplayed(column_Buyable);
	}
	
	public boolean isBuyableColumnClickable() {
		return TestUtil.isClickable(column_Buyable);
	}
	
	public boolean isManufacturerPartNumberColumnExists() {
		return TestUtil.isElementDisplayed(column_ManufacturerPartNumber);
	}
	
	public boolean isManufacturerPartNumberColumnClickable() {
		return TestUtil.isClickable(column_ManufacturerPartNumber);
	}
	
	public boolean isManufacturerNameColumnExists() {
		return TestUtil.isElementDisplayed(column_ManufacturerName);
	}
	
	public boolean isManufacturerNameColumnClickable() {
		return TestUtil.isClickable(column_ManufacturerName);
	}
	
	
	

}
