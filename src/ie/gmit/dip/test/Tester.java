package ie.gmit.dip.test;

/** 
 * @JUnit version 4 
 * @author Valery Taustsiakou
 * @StudentNumber G00296946 
 */

import static org.junit.Assert.*;
import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.junit.function.ThrowingRunnable;

import ie.gmit.dip.ChargeMenu;
import ie.gmit.dip.Runner;
import ie.gmit.dip.UserInput;
import ie.gmit.dip.AnnotationInterfaces.AfterAll;
import ie.gmit.dip.AnnotationInterfaces.AfterEach;
import ie.gmit.dip.AnnotationInterfaces.BeforeAll;
import ie.gmit.dip.AnnotationInterfaces.ParameterizedTest;
import ie.gmit.dip.AnnotationInterfaces.Timeout;
import ie.gmit.dip.AnnotationInterfaces.ValueSource;

public class Tester {

	static UserInput ip = new UserInput(); // instantiate class
	static Runner rn = new Runner();

	/**
	 * UserInput class test
	 * @method setUp
	 * @throws Exception
	 */
	
	@BeforeAll
	public static void setUp() throws Exception {
		ip = new UserInput();
	}

	/**
	 * Runner class test
	 * @method afterTester
	 */
	
	@AfterAll
	public static void afterTester() {
		rn = new Runner();
	}

	/**
	 * Runner class test
	 * @method postEach
	 */
	
	@AfterEach
	public static void postEach() {
		rn = new Runner();
	}
	
	/**
	 * @parameter
	 * @return message
	 */

	@ParameterizedTest
	@ValueSource(strings = { "20", "3" }) // age is 20 years old, number of accidents is 3
	public void MyParameterizedTest(String message) {
		assertNotNull(message); 
	}

	private void assertThrows(Class<NullPointerException> class1, ThrowingRunnable throwingRunnable) {
		// additional declaration method for testing method MySecondException()
		// generating parameters
	}
	
	/**
	 * @method NullPointerException called ExceptionTest()
	 * @return null
	 */

	@Test
	public void ExceptionTest() {
		assertThrows(NullPointerException.class, () -> {
			String strTest = null;
			if (strTest == null) {
				throw new NullPointerException("Strings can't be null");
			}
		});
	}

	/**
	 * @Timeout test for ChargeMenu class methods 
	 * @return milliSeconds
	 */
	@Test // 100 milliseconds
	// test charge menu
	@Timeout(value = 10, unit = TimeUnit.MILLISECONDS) // test runs for 100 milliseconds
	public void runTime() throws Throwable {
		for (int i = 0; i <= 10; i++) {
			//ChargeMenu.chargeOver25();
			ChargeMenu.chargeUnder25(i, i);
			//blue icon means testing method is running
		}
	} // timed out after 4 mS in the test
}
