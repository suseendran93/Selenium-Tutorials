package com.test;

import org.testng.annotations.Test;

public class TestNGFeatures {

	
	@Test
	
	public void login() {
		System.out.println("Logged in successfully");
	}
	
	@Test(dependsOnMethods="login")
	
	public void homePage() {
		
		System.out.println("Homepage");
	}
}
