package com.maven;

import org.testng.annotations.Test;

public class Priority_Issue {
	
	@Test
	private void setProperty() {

		System.out.println("Set Property");
	}
	@Test(priority = 2)
	private void browserLaunch() {

		System.out.println("Browser Launch");
	}
	@Test(priority = 1)
	private void url() {

		System.out.println("Launching the url");
	}
	@Test
	private void signin() {

		System.out.println("Sign in");
	}
	
	

}
