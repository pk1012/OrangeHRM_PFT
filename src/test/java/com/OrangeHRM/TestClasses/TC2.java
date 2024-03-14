package com.OrangeHRM.TestClasses;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.orangeHRM.UtilityClasses.Listeners.class)

public class TC2 extends TestBaseClass
{
	@Test
	public void FunctionalityTest()
	{
		System.out.println("TC2");
	}
}


