package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/susee/eclipse-workspace/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.freecrm.com/index.html");
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys("ssndrn");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("susee_1993");
		Thread.sleep(3000);
		
		WebElement login=driver.findElement(By.xpath("//input[@type='submit']"));
		try {
			WebDriverWait wait=new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.elementToBeClickable(login));
			login.click();
			}
			catch(Exception e) {
				System.out.println("Not clickable");
			}
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Frame handling
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.xpath("//a[@title='Contacts']")).click();
		Thread.sleep(1000);
		driver.close();
		
	}

}
