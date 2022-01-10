package ie.gmit.dip;

public class AgeSelectionMenu {
		
		private static boolean keepRunning = true;
		
		public static ChargeMenu chargeMenu;
		
		/**
		 * @method start()
		 * @param age<25 OR age>25
		 * @throws Exception 
		 */
		
		public static void start() throws Exception {
			while (keepRunning) {
				int age = UserInput.ageInput(); // initialise age variable
				if (age < 25) {
					ChargeMenu.chargeUnder25(age, age);
				}else if (age >=25) {
					ChargeMenu.chargeOver25();
					System.out.println("age selected over or equal 25 for older driver");
					System.out.println("Menu ended press the green play button again");
				}else if (age==0) {
					start();
				} else {
					System.out.println("[ERROR] Invalid input."); //looks for improper input
				}
			}
			keepRunning = false; //ends the menu after option selected
			return; //compile method
		}
}