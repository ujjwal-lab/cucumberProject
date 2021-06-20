/**
 * 
 */
package PageLocator;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utlis.WaitMethods;

/**
 * @author cheujku
 *
 */
public class Homapge {

	WebDriver driver;

	By searchTextArea = By.cssSelector("#custom-css-outlined-input");
	By searchIcon = By.cssSelector("#crossIcon");
	By closeCta = By.cssSelector("#typeahead-clear-btn");

	By searchTerm = By.cssSelector(".searchTerm>h2>span");

	public Homapge(WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver = driver;
	}

	public void enterSearchKeyword(String searchtxt) {

		WaitMethods.waitForElementsclickable(searchTextArea);
		driver.findElement(searchTextArea).sendKeys(searchtxt);

	}

	public void verifySearchDropDown() {
		WaitMethods.waitForElementsVisible(closeCta);
		assertTrue(driver.findElement(closeCta).isDisplayed(), "Search drop down not present");
	}

	public void clickonCloseCta() {

		WaitMethods.waitForElementsVisible(closeCta);
		driver.findElement(closeCta).click();
	}

	public void clickOnSearchIcon() {
		WaitMethods.waitForElementsclickable(searchIcon);
		driver.findElement(searchIcon).click();
	}

	public void verifySearchlist(String srchTxt) {

		WaitMethods.waitForElementPresent(searchTerm);
		String actaultxt = driver.findElement(searchTerm).getText();
		System.out.println("Showing results for :" + actaultxt);
		assertEquals(actaultxt, srchTxt);
	}
}
