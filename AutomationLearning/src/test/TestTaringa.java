package test;

import org.testng.annotations.Test;

import pages.MainPage;
import testbase.TestBaseClass;

public class TestTaringa extends TestBaseClass{

	@Test(description = "buscar en taringa")
	public void testBuscarEnTaringa(){
		MainPage mainPage = new MainPage();
		mainPage.insertSearchString("Hola");
	}
	
}
