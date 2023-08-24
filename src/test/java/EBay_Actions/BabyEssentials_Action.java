package EBay_Actions;
import EBay_Locator.BabyEssentials_Locator;
import EBay_Utility.Ebay_Basee;


public class BabyEssentials_Action extends Ebay_Basee {
	

	BabyEssentials_Locator babyessential = new BabyEssentials_Locator ();

	public void Babyessentials () {
		babyessential.Babyessentials.click();
}
}