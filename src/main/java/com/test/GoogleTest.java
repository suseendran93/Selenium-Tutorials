package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class GoogleTest {

	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
	System.setProperty("webdriver.chrome.driver", "/home/susee/eclipse-workspace/chromedriver");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.google.com");
	
}
	
	@Test (priority=1,groups="Test1")
	public void printTitle() {
		String title=driver.getTitle();
		System.out.println("\n"+title);
		
	}
	
	@Test (priority=2,groups="Test2")
	
	public void logoTest() {
		driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
	}
	
	@Test (priority=3,groups="Test1")
	
	public void linkToMail() {
		driver.findElement(By.xpath("//a[contains(text(),\"Gmail\")]")).isDisplayed();
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
}
