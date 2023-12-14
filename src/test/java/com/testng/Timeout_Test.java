package com.testng;

import org.testng.annotations.Test;

public class Timeout_Test {
	
	@Test(timeOut = 10000)
	private void login() throws InterruptedException {

		Thread.sleep(2000);
		
		System.out.println("Browser Launch");
		
		Thread.sleep(1000);
		
		System.out.println("get url");
		
		Thread.sleep(2000);
		
		System.out.println("user enter the credentials");
		
		System.out.println("User validation");
		
		Thread.sleep(5000);
		
		System.out.println("Navigate to the page");
	}
	

}
