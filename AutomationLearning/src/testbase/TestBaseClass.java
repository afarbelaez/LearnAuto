package testbase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import main.DriverCore;

public class TestBaseClass extends DriverCore{

	@BeforeMethod()
	public void beforeMethod(){
		instanceDriver();
		getDriver().navigate().to("www.taringa.net");
	}
	
	@AfterMethod()
	public void afterClass(){
		quitDriver();
	}
	
	public WebElement getElement(String locator){
		WebElement element = new WebDriverWait(getDriver(), 5)
			.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(locator)));
		return element;
	}
}
