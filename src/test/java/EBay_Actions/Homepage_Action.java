package EBay_Actions;

import EBay_Locator.Homepage_Locator;
import EBay_Utility.Ebay_Basee;


public class Homepage_Action extends Ebay_Basee {
	Homepage_Locator homepageloc = new Homepage_Locator ();	
	
	   public void Selectdropdown() {
		   homepageloc.Allcategories.click();
	   }

	    public void Baby() {
	    	homepageloc.Baby.click();
		}
	     public void Search() {
	    	 homepageloc.Search.click();{

}
}
}