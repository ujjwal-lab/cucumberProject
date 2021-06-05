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
public class ProductPopUpPage {

	WebDriver driver;

	public ProductPopUpPage(WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver = driver;
	}

	By ctnShoppingCTA = By.xpath("//span[@title='Continue shopping']");
	By proceedToCheckOut = By.xpath("//a[@title='Proceed to checkout']");

}
