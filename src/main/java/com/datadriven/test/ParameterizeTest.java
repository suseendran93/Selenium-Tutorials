package com.datadriven.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.Xls_Reader;

public class ParameterizeTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/susee/eclipse-workspace/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2F");
		
		//Xlsx file path
		Xls_Reader reader = new Xls_Reader("/home/susee/eclipse-workspace/seleniumTutorials/src/main/java/com/TestData/data.xlsx");
		int n = reader.getRowCount("RegTestData");
		
		//Add column and write data
		reader.addColumn("RegTestData","Status");
		//Parameterization
		for (int i = 2; i <= n; i++) {
			String firstname = reader.getCellData("RegTestData", "firstname", i);
			String lastname = reader.getCellData("RegTestData", "lastname", i);
			String email = reader.getCellData("RegTestData", "email", i);
			String password = reader.getCellData("RegTestData", "password", i);
			
			//WebElement
			
			
			driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(firstname);
			driver.findElement(By.xpath("//input[@id='firstname']")).clear();
			driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(lastname);
			driver.findElement(By.xpath("//input[@id='lastname']")).clear();
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
			driver.findElement(By.xpath("//input[@id='email']")).clear();
			driver.findElement(By.xpath("//input[@id='PASSWORD']")).sendKeys(password);
			driver.findElement(By.xpath("//input[@id='PASSWORD']")).clear();
			reader.setCellData("RegTestData", "Status", i, "Pass");
		}
	}

}
