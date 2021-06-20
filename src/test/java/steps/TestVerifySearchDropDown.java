package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utlis.BaseClass;

public class TestVerifySearchDropDown {

	@Given("user on Bunning {string}")
	public void user_on_Bunning(String string) {
		BaseClass.openPage(string);
	}

	@When("user enter any {string} in search area")
	public void user_enter_any_in_search_area(String string) {
		BaseClass.screens.getHomepage().enterSearchKeyword(string);
	}

	@Then("a suggestive drop-down area appears")
	public void a_suggestive_drop_down_area_appears() {
		BaseClass.screens.getHomepage().verifySearchDropDown();
	}

	@Then("user should be able to close the drop down")
	public void user_should_be_able_to_close_the_drop_down() {
		BaseClass.screens.getHomepage().clickonCloseCta();
	}

}
