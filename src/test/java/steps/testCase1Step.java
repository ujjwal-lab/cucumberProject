/**
 * 
 */
package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utlis.BaseClass;

/**
 * @author cheujku
 *
 */
public class testCase1Step {

	@Given("User loads website {string} in browser")
	public void user_loads_website_in_browser(String string) {
		// Write code here that turns the phrase above into concrete actions
		BaseClass.openPage(string);
	}

	@When("User searche for product {string} in search textarea")
	public void user_searche_for_product_in_search_textarea(String string) {
		// Write code here that turns the phrase above into concrete actions
		BaseClass.screens.getHomepage().searchProduct(string);
	}

	@Then("verify search page loads")
	public void verify_search_page_loads() {
		// Write code here that turns the phrase above into concrete actions
	}

}
