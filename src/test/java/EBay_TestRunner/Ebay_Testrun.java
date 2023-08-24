package EBay_TestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import EBay_Utility.Ebay_Basee;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/Ebay_Features"},
plugin = {"json:target/cucumber.json"},
glue = "EBay_Stepdefinition")

public class Ebay_Testrun extends AbstractTestNGCucumberTests {
	@BeforeTest
	public void Ebaystarturl () {
		Ebay_Basee starturl = new Ebay_Basee ();
		starturl.EbayBrowser();
	}
@AfterTest
   public void closeurl () {
	Ebay_Basee starturl = new Ebay_Basee ();
	starturl.driver.quit();
}
}