package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/susee/eclipse-workspace/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		
		Thread.sleep(1000);
		
		Alert alert=driver.switchTo().alert();
		
		
		
		String PopupText=alert.getText();
		String ExpectedTest="Please enter a valid user name";
		if(PopupText.equals(ExpectedTest)) {
			System.out.println("Correct Text");
			
		}
		else {
			System.out.println("Incorrect Text");
		}
		alert.accept();//OK button
		//alert.dismiss();//Cancel button
		driver.close();
	}

}
