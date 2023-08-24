package EBay_Stepdefinition;

import EBay_Actions.BabyEssentials_Action;
import EBay_Actions.BabyShoes_Action;
import EBay_Actions.Homepage_Action;
import EBay_Utility.Ebay_Basee;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class EBay_Stepdefinitions extends Ebay_Basee{
	Homepage_Action homepageaction = new Homepage_Action();
	BabyEssentials_Action babyessentials= new BabyEssentials_Action ();
	BabyShoes_Action babyshoeation = new BabyShoes_Action ();
	
	@Given("^Open the \"([^\"]*)\" application$")
	public void open_the_application(String URL) throws Throwable {
		ebaybrowseraunchingURL(URL);
	}

	@Then("^Click All categories dropdown menu$")
	public void click_All_categories_dropdown_menu() throws Throwable {
		homepageaction.Selectdropdown();
	}

	@Then("^Select Baby$")
	public void select_Baby() throws Throwable {
		homepageaction.Baby();
	}

	@Then("^Click search$")
	public void click_search() throws Throwable {
		homepageaction.Search();
	}

	@Then("^Click baby shoes$")
	public void click_baby_shoes() throws Throwable {
		babyessentials.Babyessentials();
	}
	
	@Then("^Verify Baby Shoes is displaying with all contents$")
	public void verify_Baby_Shoes_is_displaying_with_all_contents() throws Throwable {
		babyshoeation.Babyshoes();
	}
}
