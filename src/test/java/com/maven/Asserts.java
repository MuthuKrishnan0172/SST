package com.maven;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class Asserts {

	// Hard & Soft Validation & Verification

	@Test
	private void demo() {

		String actual = "John";

		String expected = "Johnson";

		Assert.assertEquals(actual, expected);

		System.out.println("Data Validation");
	}

	
	@Test
	private void demo1() {

		String actual1 = "John";

		String expected1 = "Johnson";
		
		SoftAssert soft = new SoftAssert();
		
		soft.assertEquals(actual1, expected1);
		
		System.out.println("Data Verification");
	}
	
	@Test
	private void demo2() {

		String actual2 = "John";

		String expected2 = "Johnson";

		Assert.assertEquals(actual2, expected2);

		System.out.println("Data Validation");
	}

}
