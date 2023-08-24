package EBay_Locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import EBay_Utility.Ebay_Basee;

public class BabyShoes_Locator extends Ebay_Basee{
	
public BabyShoes_Locator () {
		
		PageFactory.initElements(driver, this);
	}
 @FindBy (xpath ="//span[@class=\"b-pageheader__text\"]")
 
 public WebElement Babyshoes;

}
