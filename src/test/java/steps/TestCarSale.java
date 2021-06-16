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
public class TestCarSale {

	@Given("I want to search a car of make {string}")
	public void i_want_to_search_a_car_of_make(String string) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		BaseClass.openPage("https://www.carsales.com.au/");
		BaseClass.screens.getCarsalesHomepage().selectMakeOfCar(string);
	}

	@When("I provide for the {string} in step")
	public void i_provide_for_the_in_step(String string) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		BaseClass.screens.getCarsalesHomepage().selectModelOfCar(string);
	}

	@When("location {string}")
	public void location(String string) {
		// Write code here that turns the phrase above into concrete actions
		BaseClass.screens.getCarsalesHomepage().selectLocationOfCar(string);
	}

	@Then("I verify the search results")
	public void i_verify_the_search_results() {
		// Write code here that turns the phrase above into concrete actions
		BaseClass.screens.getCarsalesHomepage().ClickOnSearchCta();
	}

}
