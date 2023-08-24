package EBay_Locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import EBay_Utility.Ebay_Basee;

public class Homepage_Locator extends Ebay_Basee  {
	
	 public Homepage_Locator() {
     	PageFactory.initElements(driver, this);
     	
      }
	@FindBy (id = "gh-cat")
	public WebElement Allcategories;
	@FindBy (xpath = " //option[text()='Baby']")
	public WebElement Baby;
	@FindBy (id = "gh-btn")
	public WebElement Search;
}
