package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;

	public static WebDriver getDriver() {
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\mass_\\eclipse-workspace\\first\\CucumberClass2\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}
		return driver;
	}

	public void loadUrl(String url) {
		driver.get(url);
	}

	public String getAttribute(WebElement element) {
		return element.getAttribute("value");
	}

	public void selectByText(WebElement element, String value) {
		new Select(element).selectByVisibleText(value);
	}

	public void type(WebElement element, String value) {
		element.sendKeys(value);
	}

	public void btnclick(WebElement btn) {
		btn.click();
	}

}
