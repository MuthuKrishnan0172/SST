package com.maven;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Test {
	
	@Test
	private void setProperty() {

		System.out.println("Method One");
	}
	@Test(enabled = false)
	private void browserLaunch() {

		System.out.println("MEthod Two");
	}
	@Ignore
	private void url() {

		System.out.println("Method Three");
	}
	@Test
	private void signin() {

		System.out.println("Method FOur");
	}
	
	

}
