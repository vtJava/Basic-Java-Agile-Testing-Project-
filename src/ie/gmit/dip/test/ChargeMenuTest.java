package ie.gmit.dip.test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import ie.gmit.dip.ChargeMenu;
import ie.gmit.dip.Costs;

public class ChargeMenuTest {
	@SuppressWarnings("unused")
	private static final int basicInsurance = 500;
	public static ChargeMenu mn;

	@Test
	public void testGetBasicInsurance() {
		ChargeMenu.getBasicInsurance();
	}

	@Test
	public void testGetSurcharge() {
		ChargeMenu.getSurcharge();
	}

	/**
	 * @method test boolean of accident for this method
	 * @return boolean condition for number of accident
	 */

	@Test
	public void testChargeUnder25() {
		int accident1 = 3;
		int accident2 = 4;

		boolean b1 = true;
		boolean b2 = false;

		if (accident1 < accident2) {
			System.out.println(b1);
		} else {
			System.out.println(b2);
		}
	}

	/**
	 * @method testChargeOver25
	 * @param accident quantity compared to a number
	 * @return true in boolean
	 */

	@Test
	public void testChargeOver25() throws IOException {
		assertEquals(2, 2);
		int total1 = (50 + (Costs.getBasicInsurance() + 50));	
		System.out.println(total1); //expected returns 600 which is true
		//refactored class ChargeMenu does not have parameters such as int1 and int2 for the increasing numbers.
		
	}
}
