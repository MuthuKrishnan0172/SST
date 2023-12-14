package com.testng;

import org.testng.annotations.Test;

public class Grouping_Test {

	@Test(groups = "music")
	private void spotify() {

		System.out.println("Spotify");
	}
	@Test(groups = "music")
	private void wynk() {

		System.out.println("Wynk");

	}
	@Test(groups = "book")
	private void book() {

		System.out.println("Novel");

	}

	@Test(groups = "Shopping")
	private void dresses() {

		System.out.println("Dresses");
	}

	@Test(groups = "Shopping")
	private void tshirt() {

		System.out.println("Tshirts");
	}

}
