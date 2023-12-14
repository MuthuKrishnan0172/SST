package com.maven;

import org.testng.annotations.Test;

public class Expected_Exceptions {
	
	@Test(expectedExceptions = Exception.class)
	private void demo() {

		int a = 10;
		
		System.out.println(a/0);
	}
	

}
