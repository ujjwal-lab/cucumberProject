/**
 * 
 */
package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/**
 * @author cheujku
 *
 */
@CucumberOptions(features = { "src/test/resources/FeatureFiles" }, glue = { "steps" }, tags = {
		"@tagone" }, monochrome = true, plugin = { "html:target/cucumber-html-report",
				"json:target/cucumber-reports/cucumber.json" })
public class RunnerTest1 extends AbstractTestNGCucumberTests {

}
