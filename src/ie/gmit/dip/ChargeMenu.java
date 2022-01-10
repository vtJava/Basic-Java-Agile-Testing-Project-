package ie.gmit.dip;

/**
 *@class ChargeMenu  
 */

public class ChargeMenu {
	
	public ChargeMenu() throws Throwable {
		super();
		@SuppressWarnings("unused")
		int accidents = UserInput.inputAccidents();
	}
	
	static int basicInsurance = Costs.getBasicInsurance();
	static int surcharge = Costs.getSurcharge();
	private static int accidents;
	
	/**
	 * @methods getBasicInsurance setBasicInsurance 
	 * getSurcharge setSurcharge chargeUnder25 chargeOver25
	 */ 
	
	public static int getBasicInsurance() {
		return basicInsurance;
	}

	public void setBasicInsurance(int basicInsurance) {
		ChargeMenu.basicInsurance = basicInsurance;
	}

	public static int getSurcharge() {
		return surcharge;
	}

	public void setSurcharge(int surcharge) {
		ChargeMenu.surcharge = surcharge;
	}

	//parameters can make calculations correct in this menu to fix the menu performance
	public static int chargeUnder25(int total, int total1) throws Exception {
		
		basicInsurance += surcharge;
		System.out.println("Additional surcharge " + surcharge);

		System.out.print("\nHow many accidents did you have? ");
		UserInput.inputAccidents();
		switch (accidents) {
		case 0:
			System.out.println("No surcharge");
			System.out.println("Total amount to pay: " + basicInsurance);
			break;
		case 1:
			System.out.println(
					"Additional surcharge for accident: " + 50 + " \ntotal amount to pay: " + (basicInsurance + 50)); // Pay
					total = 50 + basicInsurance + 50;	
					System.out.println(total);// can improve the entire program through the returns;
			break;
		case 2:
			System.out.println(
					"Additional surcharge for accident: " + 125 + " \ntotal amount to pay: " + (basicInsurance + 125)); // Pay
				total1 = 125 + basicInsurance + 125;	
				System.out.println(total1);																						// 725
				break;
		case 3:
			System.out.println(
					"Additional surcharge for accident: " + 225 + " \ntotal amount to pay: " + (basicInsurance + 225)); // Pay
																														// 825
			break;
		case 4:
			System.out.println(
					"Additional surcharge for accident: " + 375 + " \ntotal amount to pay: " + (basicInsurance + 375)); // Pay
																														// 975
			break;
		case 5:
			System.out.println(
					"Additional surcharge for accident: " + 575 + " \ntotal amount to pay: " + (basicInsurance + 575)); // Pay
																														// 1175
			break;
		}

		if (accidents > 6)
			System.out.println("No insurance");

		return accidents; // compile method with int return value, there is no value for 6 driving accidents
	}

	
	public static int chargeOver25() throws Exception { 
		System.out.println("No additional surcharge");
		System.out.print("\nHow many accidents did you have? ");
		UserInput.inputAccidents();
		
		switch (accidents) { 
		case 0:
			System.out.println("No surcharge");
			System.out.println("Total amount to pay: " + basicInsurance);
			break;
		case 1:
			System.out.println(
					"Additional surcharge for accident: " + 50 + " \ntotal amount to pay: " + (basicInsurance + 50)); // Pay																						// 550
			break;
		case 2:
			System.out.println(
					"Additional surcharge for accident: " + 125 + " \ntotal amount to pay: " + (basicInsurance + 125)); // Pay																							// 625;
			break;
		case 3:
			System.out.println(
					"Additional surcharge for accident: " + 225 + " \ntotal amount to pay: " + (basicInsurance + 225)); // Pay
																														// 725;
			break;
		case 4:
			System.out.println(
					"Additional surcharge for accident: " + 375 + " \ntotal amount to pay: " + (basicInsurance + 375)); // Pay
																														// 875;
			break;
		case 5:
			System.out.println(
					"Additional surcharge for accident: " + 575 + " \ntotal amount to pay: " + (basicInsurance + 575)); // Pay
																														// 1075;
			break;
		}

		if (accidents > 6)
			System.out.println("No insurance");
		return accidents;
	}

}


