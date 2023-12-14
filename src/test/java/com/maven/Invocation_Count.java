package com.maven;

import org.testng.annotations.Test;

public class Invocation_Count {
	
	@Test
	private void setProperty() {

		System.out.println("Set Property");
	}
	
	@Test(invocationCount = 5)
	private void refresh() {

		System.out.println("Refresh");
	}
	
	@Test
	private void browserLaunch() {

		System.out.println("Browser Launch");
	}
	
	@Test
	private void url() {

		System.out.println("Launching Url");
	}

}
