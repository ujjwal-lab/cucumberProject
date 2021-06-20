/**
 * 
 */
package utlis;

import org.openqa.selenium.WebDriver;

import PageLocator.Homapge;

/**
 * @author cheujku
 *
 */
public class ScreenSingleTonClass {

	WebDriver driver;

	Homapge homepage;

	public ScreenSingleTonClass(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	/**
	 * @return the homepage
	 */
	public Homapge getHomepage() {
		if (homepage == null)
			return new Homapge(driver);
		return homepage;
	}

}
