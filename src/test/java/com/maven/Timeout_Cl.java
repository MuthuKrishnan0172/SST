package com.maven;

import org.testng.annotations.Test;

public class Timeout_Cl {
	
	@Test(timeOut = 10000)
	private void logIn() throws InterruptedException {
		
		Thread.sleep(2000);

		System.out.println("Browser Launch");
		
		Thread.sleep(1000);
		
		System.out.println("get url");
		
		Thread.sleep(2000);
		
		System.out.println("user name");
		
		System.out.println("validate");
		
		Thread.sleep(3000);
		
		System.out.println("navigate to home page");
		
	}
	

}
