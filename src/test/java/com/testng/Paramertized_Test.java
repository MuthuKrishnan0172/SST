package com.testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Paramertized_Test {
	
	@Test
	
	@Parameters({"username" , "password"})
	private void param(@Optional("Hedrick") String username , String password) {

		System.out.println(username);
		
		System.out.println(password);
	}

}
