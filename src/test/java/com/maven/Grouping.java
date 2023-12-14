package com.maven;

import org.testng.annotations.Test;

public class Grouping {
	
	@Test(groups = "music")
	private void spotify() {

		System.out.println("Spotify");
	}
	
	@Test(groups = "music")
	private void wynk() {

		System.out.println("Wynk");
	}
	
	@Test(groups = "Book")
	private void novel() {

		System.out.println("Novel");
	}
	
	@Test(groups = "shopping")
	private void dresses() {

		System.out.println("Dresses");
	}
	
	@Test(groups = "shopping")
	private void tshirt() {

		System.out.println("Tshirt");
	}
	

}
