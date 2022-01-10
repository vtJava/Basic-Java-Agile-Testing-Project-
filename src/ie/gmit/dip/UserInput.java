package ie.gmit.dip;

import java.util.Scanner;

public class UserInput {

	protected static UserInput ageGather;
	protected static ChargeMenu chargeMenu;
	protected static Scanner input = new Scanner(System.in);

	protected static int ageInput() throws NumberFormatException { // changed to static
		System.out.print("Enter your age: ");
		int age = Integer.parseInt(input.next());
		return age;
	}
	
	public static int inputAccidents() throws Exception {
		System.out.println("input the number of accidents");
		int accidents = input.nextInt();
		return accidents;
	}	
}
