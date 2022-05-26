package stepDefinitions;

import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import pageObjects.ArsSearch;
import pageObjects.DocsQualityRole;
import pageObjects.LoginPage;


public class BaseClass {

	public WebDriver driver;
	public LoginPage lp;
	public ArsSearch search;
	public DocsQualityRole docsQulality;
	public static Logger logger;
	public Properties configProp;

	// Created for generating random string for Unique email
	public static String randomestring() {
		String generatedString1 = RandomStringUtils.randomAlphabetic(5);
		return (generatedString1);
	}
}
