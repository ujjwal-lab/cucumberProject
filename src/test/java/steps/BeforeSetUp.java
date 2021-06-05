/**
 * 
 */
package steps;

import io.cucumber.java.Before;
import utlis.BaseClass;

/**
 * @author cheujku
 *
 */
public class BeforeSetUp {

	@Before
	public void runSetup() {
		System.out.println("Running Set Up Method");
		BaseClass.baseClassSetup();
	}
}
