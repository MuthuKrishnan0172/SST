package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class Dataprovider_Test {
	
	
	@Test(dataProvider = "data")
	private void param(String username , int password) {

		System.out.println(username);
		
		System.out.println(password);
	}
	
	@DataProvider
	private Object[][] data() {

		return new Object[][] {
			
			{"Eric" , 123},
			
			{"Helen" , 456},
			
			{"Alen" , 789}
			
		};
	}
	

}
