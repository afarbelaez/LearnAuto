package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverCore {


	private WebDriver driver;
	
	
	public void instanceDriver(){
		driver = new FirefoxDriver();
	}
	
	public WebDriver getDriver(){
		return driver;
	}
	
	public void quitDriver(){
		driver.quit();
	}
}
