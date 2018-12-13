package Selenium;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class MouseMovement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssndr\\Documents\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("http://www.spicejet.com/");
		String flights = driver.findElement(By.xpath("//a[@title='Flights']")).getAttribute("title");
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(flights, "Flightsss");
		Assert.assertEquals(flights, "Flights");
		Actions actions=new Actions(driver);
		
		actions.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Hot Meals")).click();
		driver.close();
		
	}

}
