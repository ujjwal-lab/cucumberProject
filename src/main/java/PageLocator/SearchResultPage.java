/**
 * 
 */
package PageLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author cheujku
 *
 */
public class SearchResultPage {

	WebDriver driver;

	public SearchResultPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	By sortByDrpDown = By.xpath("//select[@id='selectProductSort']");
	By addToCart = By.xpath("//span[contains(text(),'Add to cart')]");

}
