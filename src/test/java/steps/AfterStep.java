/**
 * 
 */
package steps;

import io.cucumber.java.After;
import utlis.BaseClass;

/**
 * @author cheujku
 *
 */
public class AfterStep {

	@After
	public void teardown() {
		BaseClass.tearDown();
	}
}
