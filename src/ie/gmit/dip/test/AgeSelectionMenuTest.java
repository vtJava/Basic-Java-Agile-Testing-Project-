package ie.gmit.dip.test;

import static org.junit.Assert.assertNotNull;

import java.util.concurrent.TimeUnit;

import org.junit.Test;

import ie.gmit.dip.AgeSelectionMenu;
import ie.gmit.dip.ChargeMenu;
import ie.gmit.dip.AnnotationInterfaces.Timeout;

public class AgeSelectionMenuTest {

	AgeSelectionMenu am = new AgeSelectionMenu();

	/**
	 * @method timeTest()
	 * @return milliSeconds
	 * @param AgeSelectionMenu instance of start() method
	 * @throws Throwable
	 */
	@Test 
	@Timeout(value = 100, unit = TimeUnit.MILLISECONDS) //5milliSeconds
	public void timeTest() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			AgeSelectionMenu.start();
		}
	}

	/**
	 * @method checkAgeNotNull
	 * @param age
	 * @return assertNotNull
	 * @throws Exception 
	 * 
	 */
	@Test
	public void checkAgeNotNull() throws Exception {
			assertNotNull(ChargeMenu.chargeUnder25(0, 0));
			assertNotNull(ChargeMenu.chargeOver25());
		}
	}
