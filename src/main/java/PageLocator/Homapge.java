/**
 * 
 */
package PageLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utlis.WaitMethods;

/**
 * @author cheujku
 *
 */
public class Homapge {

	WebDriver driver;

	By searchtextarea = By.xpath("//input[@id='search_query_top']");
	By searchIcon = By.xpath("//button[@name='submit_search']");

	public Homapge(WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver = driver;
	}

	public void searchProduct(String product) {

		WaitMethods.waitForElementsVisible(searchtextarea);
		driver.findElement(searchtextarea).sendKeys(product);
		WaitMethods.waitForElementsVisible(searchIcon);
		driver.findElement(searchIcon).click();
	}

}
