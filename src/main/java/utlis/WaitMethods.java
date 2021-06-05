/**
 * 
 */
package utlis;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * @author cheujku
 *
 */
public class WaitMethods {




	public static void waitForElementPresent(By locator) {

		BaseClass.wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	public static void waitForElementVisible(By locator) {

		BaseClass.wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public static void waitForElementsVisible(By locator) {

		BaseClass.wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
}
