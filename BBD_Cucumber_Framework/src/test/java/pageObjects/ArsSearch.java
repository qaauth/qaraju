package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitHelper;

public class ArsSearch {

	public WebDriver ldriver;
	WaitHelper waithelper;
	public ArsSearch(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		waithelper = new WaitHelper(ldriver);
	}

	//By txtArsSearch = By.xpath("//input[@id='complete_search_no']");
	//By clickOnSearchBtn = By.xpath("//button[@id='complete_search']");
	//By clickOnArsNumber = By.xpath("//a[contains(text(),'2325-006595')]");
	
	@FindBy(xpath = "//input[@id='complete_search_no']")
	@CacheLookup
	WebElement txtArsSearch;
	
	@FindBy(xpath = "//button[@id='complete_search']")
	@CacheLookup
	WebElement clickOnSearchBtn;
	
	@FindBy(xpath = "//a[contains(text(),'2325-006595')]")
	@CacheLookup
	WebElement clickOnArsNumber;
	
	// Action Methods
	public void setArsNumber(String ars) throws InterruptedException {
		waithelper.WaitForElement(txtArsSearch, 30);
		txtArsSearch.sendKeys(ars);
	}
	
	public void clickOnArsSearchBtn() throws InterruptedException {
		waithelper.WaitForElement(clickOnSearchBtn, 30);
		clickOnSearchBtn.click();
	}
	
	public void clickOnArsNumber() throws InterruptedException {
		waithelper.WaitForElement(clickOnArsNumber, 30);
		clickOnArsNumber.click();
	}
	
}
