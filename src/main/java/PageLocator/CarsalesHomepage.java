package PageLocator;
/**
 * 
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import utlis.WaitMethods;

/**
 * @author cheujku
 *
 */
public class CarsalesHomepage {

	WebDriver driver;

	By makeWebelement = By.id("search-field-make");
	By modelWebelement = By.id("search-field-model");
	By locationWebelement = By.id("search-field-location");
	By searchCta = By.xpath("//a[@class='search-form-submit text-white bg-primary']");

	/**
	 * @param driver
	 */
	public CarsalesHomepage(WebDriver driver) {
		this.driver = driver;
	}

	public void searchCarBasedOnLocation(String make, String model, String loc) {

		WaitMethods.waitForElementsVisible(makeWebelement);
		Select select = new Select(driver.findElement(makeWebelement));
		select.selectByVisibleText(make);

		WaitMethods.waitForElementsVisible(modelWebelement);
		Select select1 = new Select(driver.findElement(modelWebelement));
		select1.selectByVisibleText(model);

		WaitMethods.waitForElementsVisible(locationWebelement);
		Select select2 = new Select(driver.findElement(locationWebelement));
		select2.selectByVisibleText(loc);

		WaitMethods.waitForElementsVisible(searchCta);
		driver.findElement(searchCta).click();

	}

	public void selectMakeOfCar(String make) throws Exception {
		WaitMethods.waitForElementsVisible(makeWebelement);
		driver.findElement(makeWebelement).click();
		driver.findElement(By.xpath("//div[@title='" + make + "'][1]")).click();
		Thread.sleep(2000);
	}

	public void selectModelOfCar(String model) throws Exception{
		WaitMethods.waitForElementsclickable(modelWebelement);
		new Actions(driver).moveToElement(driver.findElement(modelWebelement)).click().perform();

		WaitMethods.waitForElementPresent(By.xpath("//div[@title='" + model + "'][1]"));
		driver.findElement(By.xpath("//div[@title='" + model + "'][1]")).click();
		Thread.sleep(2000);

	}

	public void selectLocationOfCar(String loc) {
		WaitMethods.waitForElementsclickable(locationWebelement);
		new Actions(driver).moveToElement(driver.findElement(locationWebelement)).click().perform();
		;
		driver.findElement(By.xpath("//div[@title='" + loc + "'][1]")).click();
	}

	public void ClickOnSearchCta() {
		WaitMethods.waitForElementsVisible(searchCta);
		driver.findElement(searchCta).click();

	}
}
