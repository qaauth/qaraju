package stepDefinitions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import pageObjects.ArsSearch;
import pageObjects.DocsQualityRole;
import pageObjects.LoginPage;

public class Steps extends BaseClass {
	@Before
	public void setup() throws IOException {
		// Added logger
		logger = Logger.getLogger("Framework"); 
		PropertyConfigurator.configure(System.getProperty("user.dir") + "/log4j.properties");// Added logger

		// Reading properties
		configProp = new Properties();
		FileInputStream configPropfile = new FileInputStream("config.properties");
		configProp.load(configPropfile);

		String br = configProp.getProperty("browser");

		if (br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", configProp.getProperty("chromepath"));
			driver = new ChromeDriver();
		} else if (br.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", configProp.getProperty("firefoxpath"));
			driver = new FirefoxDriver();
		} else if (br.equals("ie")) {
			System.setProperty("webdriver.ie.driver", configProp.getProperty("iepath"));
			driver = new InternetExplorerDriver();
		}

		logger.info("Launching browser Chrome Browser has Successfully!");
	}

	@Given("^User Launch Chrome browser$")
	public void user_Launch_Chrome_browser() throws Throwable {
		lp = new LoginPage(driver);
	}

	@When("^User opens URL \"([^\"]*)\"$")
	public void user_opens_URL(String url) throws Throwable {
		logger.info("Open Bridge URL has Successfully!");
		driver.get(url);
		driver.manage().window().maximize();
	}

	@When("^User enters Email as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
	public void user_enters_Email_as_and_Password_as(String email, String password) throws Throwable {
		logger.info("Providing Valid Login details have Successfully!");
		lp.setUserName(email);
		lp.setPassword(password);
	}

	@Then("^Click on Login$")
	public void click_on_Login() throws Throwable {
		logger.info("Started login has successfully!");
		lp.clickLogin();
		Thread.sleep(3000);
	}
	
	@Then("^Page Title should be \"([^\"]*)\"$")
	public void page_Title_should_be(String title) throws Throwable {
		if (driver.getPageSource().contains("Login was unsuccessful.")) {
			driver.close();
			logger.info("******** Login Failed*********");
			Assert.assertTrue(false);
		} else {
			logger.info("******** Login Passed*********");
			Assert.assertEquals(title, driver.getTitle());
		}
		Thread.sleep(3000);
	}

	@When("^User click on Log out link$")
	public void user_click_on_Log_out_link() throws Throwable {
		lp.clickOnLogout();
		Thread.sleep(3000);
	}

	@Then("^close browser$")
	public void close_browser() throws Throwable {
		logger.info("Browser closing browser has successfuly!");
		driver.quit();
	}
	
	// ********* Search ARS number and verify details********

	@Then("^Enter ars number in search text field$")
	public void enter_ars_number_in_search_text_field() throws Throwable {
		logger.info("Ars Number has Entered successfuly!");
		search = new ArsSearch(driver);
		search.setArsNumber("2325-006595");
	}

	@Then("^Click on search button$")
	public void click_on_search_button() throws Throwable {
		logger.info("Ars Number Search Button has clicked on successfuly!");
		search.clickOnArsSearchBtn();
	}

	@Then("^Click on ars number to view the details$")
	public void click_on_ars_number_to_view_the_details() throws Throwable {
		logger.info("Ars Number has clicked on successfuly!");
		search.clickOnArsNumber();
	}
	
	// ********* Docs Quality ************************
	@When("^Select Docs Quality role$")
	public void select_Docs_Quality_role() throws Throwable {
		logger.info("Select Docs Quality role  successfuly!");
		docsQulality = new DocsQualityRole(driver);
		docsQulality.selectDocsQuality();
	}

	@Then("^Click on Dashboard Module$")
	public void click_on_Dashboard_Module() throws Throwable {
		logger.info("Clicked on Dashboard module has successfuly!");
		docsQulality.clickOnDashboard();
	}

	@Then("^Enter Ars number in search text field$")
	public void enter_Ars_number_in_search_text_field() throws Throwable {
		logger.info("Ars Number has Entered successfuly!");
		docsQulality.setArsNumberDocs("2325-006595");
	}

	@Then("^Click On Search button of the ars$")
	public void click_On_Search_button_of_the_ars() throws Throwable {
		logger.info("Clicked on Search Button successfuly!");
		docsQulality.clickOnSearch();
	}

	@Then("^verify serach result No Cases found$")
	public void verify_serach_result_No_Cases_found() throws Throwable {
		logger.info("Verify No Cases found has successfuly!");
		String textName= docsQulality.verifyNoCasesfound();
		Assert.assertEquals(textName, "No Cases found");
	}

}
