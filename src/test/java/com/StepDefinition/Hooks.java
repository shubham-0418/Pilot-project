package com.StepDefinition;

import com.util.HelperClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	@Before
	public static void setUp() {
		HelperClass.setUpDriver();
	}
	
	@After
	public static void teardown() {
		HelperClass.teardown();
	}

}
