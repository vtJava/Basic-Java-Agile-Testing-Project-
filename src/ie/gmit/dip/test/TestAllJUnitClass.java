package ie.gmit.dip.test;

import org.junit.runners.Suite; 
import org.junit.runners.Suite.SuiteClasses;

import ie.gmit.dip.UserInput;

import org.junit.runner.RunWith;

/** 
 * @class TestAllJUnitClass
 * @Suite CostsTest.class, UserInput.class, Tester.class
 * @return All Test class methods
 */

class TestAllJUnitClass {

	@RunWith(Suite.class)
	@SuiteClasses({ CostsTest.class, UserInput.class, Tester.class, AgeSelectionMenuTest.class })
	
	class Runner {

	}
}