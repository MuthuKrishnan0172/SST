package com.maven;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {
	
	int start = 1;
	
	int end = 3;

	
	public boolean retry(ITestResult result) {
		
		if (start<=end) { // 1<=3  1<=3 1<=3
			
			start++;
			
			return true;
			
		}
	
		return false;
	}

}
