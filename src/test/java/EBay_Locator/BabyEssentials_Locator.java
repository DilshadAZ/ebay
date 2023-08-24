package EBay_Locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import EBay_Utility.Ebay_Basee;

public class BabyEssentials_Locator extends Ebay_Basee{
	public BabyEssentials_Locator () {
		 
		 PageFactory.initElements(driver, this);
	 } 
		 @FindBy (xpath = "//div[text()='Baby Shoes']")
		 public WebElement Babyessentials;
}
