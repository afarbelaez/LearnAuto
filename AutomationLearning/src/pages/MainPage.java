package pages;

import locators.Locators;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import testbase.TestBaseClass;

public class MainPage extends TestBaseClass{

	
	WebElement buscarInput;
	
	//Actions
	public void insertSearchString(String searchTerm){
		getBuscarInput().sendKeys(searchTerm);
		getBuscarInput().sendKeys(Keys.ENTER);
	}
	
	
	// GETTTERS
	public WebElement getBuscarInput(){
		buscarInput = getElement(Locators.MainPage.BUSCAR);
		return buscarInput;
	}
	
	
}
