package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {

	@BeforeSuite//1

	public void setup() {
		System.out.println("Setup system property");
	}

	@BeforeTest//2

	public void login() {
		System.out.println("Login method");
	}

	@BeforeClass//3

	public void launchBrowser() {
		System.out.println("Launch chrome");

	}

	@BeforeMethod//4

	public void entreMethod() {
		System.out.println("Enter URL");
	}

	@Test//5

	public void googleTitleTest() {
		System.out.println("Google title test");
	}
	
	@Test
	
	public void yahooTitleTest() {
		System.out.println("Yahoo title test");
	}
	
	@Test
	
	public void fbTitleTest() {
		System.out.println("Facebook title test");
	}
	@Test
	
	public void whatsappTitleTest() {
		System.out.println("Whatsapp title test");
	}
	
	@AfterMethod//6
	public void closeApp() {

		System.out.println("Close Application");

	}

	@AfterClass//7
	public void closeBrowser() {
		System.out.println("Close browser");
	}

	@AfterTest//8

	public void deleteCookies() {
		System.out.println("Delete all cookies");
	}

	@AfterSuite//9

	public void report() {
		System.out.println("Generate report");
	}

}
