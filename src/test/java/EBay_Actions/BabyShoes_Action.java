package EBay_Actions;

import org.testng.Assert;

import EBay_Locator.BabyShoes_Locator;
import EBay_Utility.Ebay_Basee;


public class BabyShoes_Action extends Ebay_Basee {
	BabyShoes_Locator babyshoelocator = new BabyShoes_Locator();

	public void Babyshoes() {
		boolean babyshoedisplay = babyshoelocator.Babyshoes.isDisplayed();
		Assert.assertTrue(babyshoedisplay);
}
}