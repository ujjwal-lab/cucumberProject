package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utlis.BaseClass;

public class TestVerifySearchResult {

	@When("clicks on search icon")
	public void clicks_on_search_icon() {

		BaseClass.screens.getHomepage().clickOnSearchIcon();
	}

	@Then("search result page should {string}")
	public void search_result_page_should(String string) {

		BaseClass.screens.getHomepage().verifySearchlist(string);
	}
}
