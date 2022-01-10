package ie.gmit.dip;

public class Costs {

	static int basicInsurance = 500;
	static int surcharge = 100; // under 25 years
	
	/**
	 * @parameter basic Insurance
	 * @return surcharge & basicInsurance integers
	 */
	
	public static int getSurcharge() {
		return surcharge;
		
	}
	public static int getBasicInsurance() {
		return basicInsurance;
	}
}
