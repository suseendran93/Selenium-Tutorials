	package com.datadriven.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.Xls_Reader;

public class DataDrivenTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/susee/eclipse-workspace/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2F");
		
		Xls_Reader reader=new Xls_Reader("/home/susee/eclipse-workspace/seleniumTutorials/src/main/java/com/TestData/data.xlsx"); 
		
		String firstname=	reader.getCellData("RegTestData", "firstname", 2);
		String lastname=	reader.getCellData("RegTestData", "lastname", 2);
		String email=		reader.getCellData("RegTestData", "email", 2);
		String password=	reader.getCellData("RegTestData", "password", 2);
		
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(firstname);
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(lastname);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='PASSWORD']")).sendKeys(password);
		System.out.println(firstname);
	}

}
