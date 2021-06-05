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
		"@tagtwo" }, monochrome = true)
public class RunnerTest2 extends AbstractTestNGCucumberTests {

}
