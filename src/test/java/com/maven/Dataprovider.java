package com.maven;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	
	@Test(dataProvider = "data")
	private void credentials(String username , int password) {

		System.out.println(username);
		
		System.out.println(password);
	}
	
	@DataProvider
	private Object[][] data() {

		return new Object[][] {
			
			{"Java" , 15},
			
			{"Selenium" , 25},
			
			{"Maven" , 35}
			
			
		};
	}

}
