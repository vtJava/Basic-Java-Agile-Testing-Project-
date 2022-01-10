package ie.gmit.dip.test;

import static org.junit.Assert.*;
import org.junit.Test;

import ie.gmit.dip.Costs;

public class CostsTest {
	
	/**
	 * @param surcharge
	 * @return 100 as integer
	 * @method testSurchargeCost
	 */

	@Test
	public void testSurchargeCost() {
		assertEquals(Costs.getSurcharge(), 100);
	}

	/**
	 * @param basicInsurance
	 * @return 500 as integer
	 * @method testBasicInsurance
	 */
	
	@Test
	public void testBasicInsurance() {
		assertEquals(Costs.getBasicInsurance(), 500);
	}
}
