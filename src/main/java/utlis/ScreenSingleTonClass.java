/**
 * 
 */
package utlis;

import org.openqa.selenium.WebDriver;

import PageLocator.Homapge;
import PageLocator.ProductPopUpPage;
import PageLocator.SearchResultPage;

/**
 * @author cheujku
 *
 */
public class ScreenSingleTonClass {

	WebDriver driver;

	Homapge homepage;
	ProductPopUpPage productpop;
	SearchResultPage resultPage;

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

	/**
	 * @return the productpop
	 */
	public ProductPopUpPage getProductpop() {
		if (productpop == null)
			return new ProductPopUpPage(driver);
		return productpop;
	}

	/**
	 * @return the resultPage
	 */
	public SearchResultPage getResultPage() {
		if (resultPage == null)
			return new SearchResultPage(driver);
		return resultPage;
	}

}
