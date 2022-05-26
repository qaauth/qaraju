package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitHelper;

public class LoginPage {
	public WebDriver ldriver;
	WaitHelper waithelper;
	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		waithelper = new WaitHelper(ldriver);
	}

	@FindBy(xpath = "//input[@id='login_email']")
	@CacheLookup
	WebElement txtEmail;

	@FindBy(css = "#login_password")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(xpath = "//button[contains(text(),'Login')]")
	@CacheLookup
	WebElement btnLogin;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/ul[1]/li[16]/a[1]")
	@CacheLookup
	WebElement clickOnLogoutBtn;
	

	public void setUserName(String uname) {
		waithelper.WaitForElement(txtEmail, 30);
		txtEmail.sendKeys(uname);

	}

	public void setPassword(String pwd) {
		waithelper.WaitForElement(txtPassword, 30);
		txtPassword.sendKeys(pwd);
	}

	public void clickLogin() throws InterruptedException {
		Thread.sleep(2000);
		btnLogin.click();
	}
	
	public void clickOnLogout() throws InterruptedException {
		waithelper.WaitForElement(clickOnLogoutBtn, 30);
		clickOnLogoutBtn.click();
		Thread.sleep(2000);
	}
}
