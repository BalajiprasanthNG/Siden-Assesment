package org.stepdefnition;

import org.Utility.UtilityClass;

import io.cucumber.java.*;

public class Hooks extends UtilityClass{

	@Before
	public void beforeScenario() {
		ChromeLaunch();
		UrlLaunch("https://www.saucedemo.com/");
		implicitWait(10);

	}

	@After
	public void afterScenario() {
		quit();

	}
}
