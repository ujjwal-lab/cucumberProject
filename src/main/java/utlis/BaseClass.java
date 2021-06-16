/**
 * 
 */
package utlis;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author cheujku
 *
 */
public class BaseClass {

	// initialize webdriver
	private static WebDriver driver;

	public static BaseClass baseClass;
	public static WebDriverWait wait;

	public static ScreenSingleTonClass screens;
	public final static int TIMEOUT = 30;
	public final static int PAGE_LOAD_TIMEOUT = 50;

	private BaseClass() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		wait = new WebDriverWait(driver, TIMEOUT);
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		String window = driver.getWindowHandle();
		System.out.println("Window ->" + window);

		screens = new ScreenSingleTonClass(driver);

	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void tearDown() {
		if (driver != null) {
			driver.close();
			driver.quit();
		}
	}

	public static void openPage(String url) {
		System.out.println(url);
		System.out.println(driver);
		driver.get(url);
	}

	public static void baseClassSetup() {

		baseClass = new BaseClass();
	}

}
