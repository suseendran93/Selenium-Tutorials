package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/susee/eclipse-workspace/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("http://jqueryui.com/");
		
		driver.findElement(By.linkText("Droppable")).click();
		Thread.sleep(1000);
		Actions action=new Actions(driver);
		//action.clickAndHold(driver.findElement(By.xpath("//div[@id='draggable']")));
		//Thread.sleep(1000);
		driver.switchTo().frame(0);
		action.dragAndDrop(driver.findElement(By.xpath("//div[@id='draggable']")), driver.findElement(By.xpath("//div[@id='droppable']"))).build().perform();
		Thread.sleep(1000);
		driver.close();

	}

}
