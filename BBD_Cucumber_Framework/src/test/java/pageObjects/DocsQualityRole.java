package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.WaitHelper;

public class DocsQualityRole {

	public WebDriver ldriver;
	WaitHelper waithelper;
	public DocsQualityRole(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		waithelper = new WaitHelper(ldriver);
	}

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/div[1]/select[1]")
	@CacheLookup
	WebElement selectDocsQualityRole;
	
	@FindBy(xpath = "//a[contains(text(),'Dashboard')]")
	@CacheLookup
	WebElement clickOnDashboardModule;
	
	@FindBy(xpath = "//input[@id='complete_search_no']")
	@CacheLookup
	WebElement txtArsNumber;
	
	@FindBy(xpath = "//button[@id='complete_search']")
	@CacheLookup
	WebElement clickOnSearchBtn;
	
	@FindBy(xpath = "//h2[contains(text(),'No Cases found')]")
	@CacheLookup
	WebElement verifyNoCasesfound;
	
	// Action Methods
	public void selectDocsQuality() throws InterruptedException {
		//waithelper.WaitForElement(selectDocsQualityRole, 60);
		Thread.sleep(5000);
		Select docsQuality = new Select(selectDocsQualityRole);
		docsQuality.selectByVisibleText("Docs Quality");
	}
	
	public void clickOnDashboard() throws InterruptedException {
		//waithelper.WaitForElement(clickOnDashboardModule, 60);
		Thread.sleep(3000);
		clickOnDashboardModule.click();
	}
	
	public void setArsNumberDocs(String ars) {
		waithelper.WaitForElement(txtArsNumber, 60);
		txtArsNumber.sendKeys(ars);
	}
	
	public void clickOnSearch() {
		waithelper.WaitForElement(clickOnSearchBtn, 60);
		clickOnSearchBtn.click();
	}
	
	public String verifyNoCasesfound() {
		waithelper.WaitForElement(verifyNoCasesfound, 60);
		return verifyNoCasesfound.getText();
		
	}
	
	
}
