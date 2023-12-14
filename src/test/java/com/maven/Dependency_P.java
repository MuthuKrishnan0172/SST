package com.maven;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Dependency_P {
	
	@Test
	private void mobile() {

		System.out.println("Mobile");
	}
	
	
	@Test(dependsOnMethods = "watch" )
	private void offer() {

		System.out.println("Offer");
	}
	
	@Ignore
	@Test
	private void watch() {

		System.out.println("Watch");
	}
	

}
