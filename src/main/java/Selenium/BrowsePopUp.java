package Selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowsePopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/susee/eclipse-workspace/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("https://html.com/input-type-file/");
		WebElement popup=driver.findElement(By.xpath("//a[@title='Close']"));
	
		//Explicit wait
		try {
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(popup));
		popup.click();
		}
		catch(Exception e) {
			System.out.println("Pop up not found");
		}
				
			
		driver.findElement(By.xpath("//input[@name=\"fileupload\"]")).sendKeys("/home/susee/Desktop/Python.odt");
		
	
		
	}

}
