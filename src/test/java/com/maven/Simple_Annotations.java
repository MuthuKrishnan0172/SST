package com.maven;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotations {
	
	@BeforeSuite
	private void setproperty() {

		System.out.println("Set Property");
	}
	@BeforeTest
	private void browserLaunch() {

		System.out.println("Browser Launch");
	}
	
	@BeforeClass
	private void url() {

		System.out.println("Launching the Url");
	}
	@BeforeMethod
	private void signin() {

		System.out.println("Sign in");
	}
	@Test
	private void women() {

		System.out.println("WOmen");
	}
	
	@AfterMethod
	private void signoff() {

		System.out.println("Sign off");
	}
	@AfterClass
	private void homePage() {

		System.out.println("Home Page");
	}
	@AfterTest
	private void close() {

		System.out.println("Close");
	}
	
	@Test
	private void dresses() {

		System.out.println("Dresses");
	}
	@Test
	private void tshirts() {

		System.out.println("T-Shirts");
	}
	@AfterSuite
	private void deleteCOokies() {

		System.out.println("Delete Cookies");
	}
}
